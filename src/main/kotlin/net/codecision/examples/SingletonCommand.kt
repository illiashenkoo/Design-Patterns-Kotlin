package net.codecision.examples

import net.codecision.designpatterns.patterns.singleton.Singleton
import net.codecision.examples.base.Command

class SingletonCommand : Command {

    override fun execute() {
        println("========== Singleton ==========")

        Singleton.print()

        Singleton.print()

        println("========== /Singleton ==========")
    }

}