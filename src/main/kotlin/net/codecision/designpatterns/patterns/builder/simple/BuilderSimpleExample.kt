package net.codecision.designpatterns.patterns.builder.simple

import net.codecision.utils.ExampleCommand

class BuilderSimpleExample : ExampleCommand("Builder (Simple)") {

    override fun showExample() {

        println(
            CarBuilder()
                .addBrand("Volkswagen")
                .addSpeed(250)
                .build()
        )

        println(
            CarBuilder()
                .addBrand("Hyundai")
                .addModel("Sonata")
                .build()
        )

        println(
            CarBuilder()
                .addBrand("Ford")
                .addModel("Edge")
                .addSpeed(210)
                .build()
        )

    }

}