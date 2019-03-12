package net.codecision.designpatterns.patterns.command

//Receiver
class Computer {

    fun on() {
        println("Power on!")
    }

    fun off() {
        println("Power off!")
    }

    fun restart() {
        println("Reboot!")
    }

}

//ConcreteCommand
class OnCommand(private val computer: Computer) : Command {

    override fun execute() {
        computer.on()
    }

}

//ConcreteCommand
class OffCommand(private val computer: Computer) : Command {

    override fun execute() {
        computer.off()
    }

}

//ConcreteCommand
class RestartCommand(private val computer: Computer) : Command {

    override fun execute() {
        computer.restart()
    }

}

interface Command {

    fun execute()

}

//Invoker
class User(
    private val commands: Map<CommandKey, Command>
) {

    fun startComputer() {
        commands[CommandKey.ON]?.execute()
    }

    fun stopComputer() {
        commands[CommandKey.OFF]?.execute()
    }

    fun rebootComputer() {
        commands[CommandKey.RESTART]?.execute()
    }

}

enum class CommandKey {
    ON, OFF, RESTART
}