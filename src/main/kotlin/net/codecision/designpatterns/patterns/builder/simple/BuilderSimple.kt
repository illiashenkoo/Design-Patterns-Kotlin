package net.codecision.designpatterns.patterns.builder.simple

data class Car(
    var brand: String,
    var model: String,
    var speed: Int
) {

    constructor() : this("", "", 150)

}

open class CarBuilder {

    var brand: String? = null

    var model: String? = null

    var speed: Int? = null

    fun addBrand(brand: String?): CarBuilder {
        this.brand = brand
        return this
    }

    fun addModel(model: String?): CarBuilder {
        this.model = model
        return this
    }

    fun addSpeed(speed: Int?): CarBuilder {
        this.speed = speed
        return this
    }

    fun build(): Car {
        val car = Car()

        val brand = this.brand
        if (brand != null) {
            car.brand = brand
        }

        val model = this.model
        if (model != null) {
            car.model = model
        }

        val speed = this.speed
        if (speed != null) {
            car.speed = speed
        }

        return car
    }

}