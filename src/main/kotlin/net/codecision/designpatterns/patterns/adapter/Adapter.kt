package net.codecision.designpatterns.patterns.adapter

interface Drawer {

    fun drawLine()

    fun drawSquare()

    fun drawCircle()

}

open class RasterDrawer {

    fun drawRasterLine() {
        println("Draw a line")
    }

    fun drawRasterSquare() {
        println("Draw a square")
    }

    fun drawRasterCircle() {
        println("Draw a circle")
    }

}

class DrawerAdapterInheritance : RasterDrawer(), Drawer {

    override fun drawLine() {
        drawRasterLine()
    }

    override fun drawSquare() {
        drawRasterSquare()
    }

    override fun drawCircle() {
        drawRasterCircle()
    }

}

class DrawerAdapterComposition(
    private val rasterDrawer: RasterDrawer
) : Drawer {

    override fun drawLine() {
        rasterDrawer.drawRasterLine()
    }

    override fun drawSquare() {
        rasterDrawer.drawRasterSquare()
    }

    override fun drawCircle() {
        rasterDrawer.drawRasterCircle()
    }

}