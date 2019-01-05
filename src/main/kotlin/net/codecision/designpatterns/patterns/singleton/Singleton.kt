package net.codecision.designpatterns.patterns.singleton

import java.util.*

object Singleton {

    private val id: String = generateId()

    init {
        println("Initializing with object id: $id")
    }

    fun print() = println("Printing with object id:     $id")

    private fun generateId() = UUID.randomUUID().toString()

}