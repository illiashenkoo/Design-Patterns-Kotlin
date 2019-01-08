package net.codecision.designpatterns.patterns.factoryMethod

interface Drink {

    fun printName()

}

class Juice : Drink {

    override fun printName() {
        println("it's Juice.")
    }

}

class Lemonade : Drink {

    override fun printName() {
        println("it's Lemonade.")
    }

}

interface DrinkMaker {

    fun pourIntoBottle(): Drink

}

class JuiceMaker : DrinkMaker {

    override fun pourIntoBottle(): Drink {
        return Juice()
    }

}

class LemonadeMaker : DrinkMaker {

    override fun pourIntoBottle(): Drink {
        return Lemonade()
    }

}