package net.codecision.designpatterns.patterns.facade

import net.codecision.utils.ExampleCommand

class FacadeExample : ExampleCommand("Facade") {

    override fun showExample() {
        val carEngineFacade = CarEngineFacade()

        carEngineFacade.startEngine()

        println("\nEngine running!\n")

        carEngineFacade.stopEngine()

    }

}