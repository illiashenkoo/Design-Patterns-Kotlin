package net.codecision

import net.codecision.designpatterns.patterns.abstractFactory.AbstractFactoryExample
import net.codecision.designpatterns.patterns.builder.full.BuilderFullExample
import net.codecision.designpatterns.patterns.builder.simple.BuilderSimpleExample
import net.codecision.designpatterns.patterns.facade.FacadeExample
import net.codecision.designpatterns.patterns.factoryMethod.FactoryMethodExample
import net.codecision.designpatterns.patterns.prototype.PrototypeExample
import net.codecision.designpatterns.patterns.singleton.SingletonExample
import net.codecision.utils.ExampleCommand
import net.codecision.utils.Pattern
import net.codecision.utils.Pattern.*

fun main(args: Array<String>) {

    val patterns = arrayOf(
        SINGLETON,
        BUILDER_SIMPLE,
        BUILDER_FULL,
        PROTOTYPE,
        FACTORY_METHOD,
        ABSTRACT_FACTORY,
        FACADE
    )

    execute(patterns)
}

private fun execute(patterns: Array<Pattern>) {
    val commands = getCommands()

    patterns.forEach {
        commands[it]?.execute()
    }
}

private fun getCommands(): Map<Pattern, ExampleCommand> {
    return mapOf(
        SINGLETON to SingletonExample(),
        BUILDER_SIMPLE to BuilderSimpleExample(),
        BUILDER_FULL to BuilderFullExample(),
        PROTOTYPE to PrototypeExample(),
        FACTORY_METHOD to FactoryMethodExample(),
        ABSTRACT_FACTORY to AbstractFactoryExample(),
        FACADE to FacadeExample()
    )
}
