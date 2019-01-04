package net.codecision

import net.codecision.examples.SingletonCommand
import net.codecision.examples.base.Command
import net.codecision.examples.base.CommandKey

fun main(args: Array<String>) {

    val commands = getCommands()

    commands[CommandKey.SINGLETON]?.execute()

}

private fun getCommands(): Map<CommandKey, Command> {
    return mapOf(
        CommandKey.SINGLETON to SingletonCommand()
    )
}
