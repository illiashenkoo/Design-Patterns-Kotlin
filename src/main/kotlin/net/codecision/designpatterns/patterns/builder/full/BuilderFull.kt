package net.codecision.designpatterns.patterns.builder.full

data class Car(
    var brand: String,
    var model: String,
    var speed: Int
) {

    constructor() : this("", "", 150)

}

interface CarBuilder {

    fun reset()

    fun addBrand()

    fun addModel()

    fun addSpeed()

    fun getResult(): Car

}

class VolkswagenBuilder : CarBuilder {

    private var car: Car = Car()

    override fun reset() {
        car = Car()
    }

    override fun addBrand() {
        car.brand = "Volkswagen"
    }

    override fun addModel() {
        car.model = "Arteon"
    }

    override fun addSpeed() {
        car.speed = 260
    }

    override fun getResult(): Car = car

}

class HyundaiBuilder : CarBuilder {

    private var car: Car = Car()

    override fun reset() {
        car = Car()
    }

    override fun addBrand() {
        car.brand = "Hyundai"
    }

    override fun addModel() {
        car.model = "Sonata"
    }

    override fun addSpeed() {
        car.speed = 190
    }

    override fun getResult(): Car = car

}

class FordBuilder : CarBuilder {

    private var car: Car = Car()

    override fun reset() {
        car = Car()
    }

    override fun addBrand() {
        car.brand = "Ford"
    }

    override fun addModel() {
        car.model = "Edge"
    }

    override fun addSpeed() {
        car.speed = 210
    }

    override fun getResult(): Car = car

}

class Director(private var builder: CarBuilder) {

    fun changeBuilder(builder: CarBuilder) {
        this.builder = builder
    }

    fun make(): Car {
        builder.reset()

        builder.addBrand()
        builder.addModel()
        builder.addSpeed()

        return builder.getResult()
    }

}

