package net.codecision.designpatterns.patterns.builder.full

import net.codecision.utils.ExampleCommand

class BuilderFullExample : ExampleCommand("Builder (Full)") {

    override fun showExample() {

        val director = Director(VolkswagenBuilder())
        println(director.make())

        director.changeBuilder(FordBuilder())
        println(director.make())

        director.changeBuilder(HyundaiBuilder())
        println(director.make())

    }

}