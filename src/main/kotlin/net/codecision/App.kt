package net.codecision

import net.codecision.designpatterns.patterns.builder.full.BuilderFullExample
import net.codecision.designpatterns.patterns.builder.simple.BuilderSimpleExample
import net.codecision.designpatterns.patterns.prototype.PrototypeExample
import net.codecision.designpatterns.patterns.singleton.SingletonExample
import net.codecision.utils.ExampleCommand
import net.codecision.utils.Pattern
import net.codecision.utils.Pattern.*

fun main(args: Array<String>) {

    val commands = getCommands()

    commands[SINGLETON]?.execute()
    commands[BUILDER_SIMPLE]?.execute()
    commands[BUILDER_FULL]?.execute()
    commands[PROTOTYPE]?.execute()

}

private fun getCommands(): Map<Pattern, ExampleCommand> {
    return mapOf(
        SINGLETON to SingletonExample(),
        BUILDER_SIMPLE to BuilderSimpleExample(),
        BUILDER_FULL to BuilderFullExample(),
        PROTOTYPE to PrototypeExample()
    )
}
