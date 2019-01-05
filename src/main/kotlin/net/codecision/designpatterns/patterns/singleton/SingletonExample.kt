package net.codecision.designpatterns.patterns.singleton

import net.codecision.utils.ExampleCommand

class SingletonExample : ExampleCommand("Singleton") {

    override fun showExample() {
        Singleton.print()

        Singleton.print()
    }

}