package net.codecision.designpatterns.patterns.factoryMethod

import net.codecision.utils.ExampleCommand

class FactoryMethodExample : ExampleCommand("Factory Method") {

    override fun showExample() {

        var drinkMaker = getDrinkMaker(Maker.JUICE)
        pourIntoBottle(drinkMaker)

        drinkMaker = getDrinkMaker(Maker.LEMONADE)
        pourIntoBottle(drinkMaker)

    }

}

private fun pourIntoBottle(drinkMaker: DrinkMaker) {
    val drink = drinkMaker.pourIntoBottle()
    drink.printName()
}

private fun getDrinkMaker(maker: Maker): DrinkMaker {
    return when (maker) {
        Maker.JUICE -> JuiceMaker()
        Maker.LEMONADE -> LemonadeMaker()
    }
}

enum class Maker {
    JUICE, LEMONADE
}