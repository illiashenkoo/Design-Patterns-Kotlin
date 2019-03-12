package net.codecision.designpatterns.patterns.command

import net.codecision.utils.ExampleCommand

class CommandExample : ExampleCommand("Command") {

    //Client
    override fun showExample() {

        //Receiver
        val computer = Computer()

        //Concrete Commands
        val commands = mapOf(
            CommandKey.ON to OnCommand(computer),
            CommandKey.OFF to OffCommand(computer),
            CommandKey.RESTART to RestartCommand(computer)
        )

        //Invoker
        val user = User(commands)

        user.startComputer()

        user.rebootComputer()

        user.stopComputer()
    }

}