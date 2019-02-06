package net.codecision.designpatterns.patterns.adapter

import net.codecision.utils.ExampleCommand

class AdapterExample : ExampleCommand("Adapter") {

    override fun showExample() {
        // first implementation example
        val drawerInheritance = DrawerAdapterInheritance()
        runClientCode(drawerInheritance)

        // divide examples in log
        printEmptyLine()

        // second implementation example
        val rasterDrawer = RasterDrawer()
        val drawerComposition = DrawerAdapterComposition(rasterDrawer)
        runClientCode(drawerComposition)
    }

    //client code just know about Drawer interface
    private fun runClientCode(drawer: Drawer) {
        drawer.drawLine()
        drawer.drawSquare()
        drawer.drawCircle()
    }

}