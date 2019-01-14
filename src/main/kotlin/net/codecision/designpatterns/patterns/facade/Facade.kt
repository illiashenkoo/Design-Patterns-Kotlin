package net.codecision.designpatterns.patterns.facade


class Ignition {

    fun on() {
        println("Ignition turned on")
    }

    fun off() {
        println("Ignition turned off")
    }

}

class Starter {

    fun start() {
        println("Starting the starter")
    }

}

class FuelInjector {

    private val fuelPump = FuelPump()

    fun on() {
        println("Fuel injector turned on")
    }

    fun inject() {
        fuelPump.pump()
        println("Inject the fuel")
    }

    fun off() {
        println("Fuel injector turned off")
    }
}

class FuelPump {

    fun pump() {
        println("Pumping fuel")
    }

}

class AirFlowController {

    private val airFlowMeter = AirFlowMeter()

    fun on() {
        println("Air Controller turned on")
    }

    fun takeAir() {
        airFlowMeter.getMeasurements()

        println("Pumping air")
    }

    fun off() {
        println("Air Controller turned off")
    }
}

class AirFlowMeter {

    fun getMeasurements() {
        println("Get air measurement")
    }

}

class CarEngineFacade {

    private val ignition = Ignition()
    private val starter = Starter()
    private val fuelInjector = FuelInjector()
    private val airFlowController = AirFlowController()

    fun startEngine() {
        ignition.on()

        fuelInjector.on()
        fuelInjector.inject()

        airFlowController.on()
        airFlowController.takeAir()

        starter.start()
    }

    fun stopEngine() {
        ignition.off()

        fuelInjector.off()

        airFlowController.off()
    }

}