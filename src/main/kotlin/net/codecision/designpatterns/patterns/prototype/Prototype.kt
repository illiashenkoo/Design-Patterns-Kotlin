package net.codecision.designpatterns.patterns.prototype

data class Phone(
    val brand: String,
    val model: String,
    val displaySize: Float
) : Cloneable {

    override fun clone(): Phone {
        return Phone(brand, model, displaySize)
    }

}

/**
 * Just for example. In real project use kotlin.Cloneable instead this interface.
 */
interface Cloneable {

    fun clone(): Any

}