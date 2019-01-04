package net.codecision.designpatterns.types.creational.singleton

import java.util.*

object Singleton {

    private val id: String = generateId()

    init {
        println("Initializing with object: $id")
    }

    fun print() = println("Printing with object: $id")

    private fun generateId() = UUID.randomUUID().toString()

}