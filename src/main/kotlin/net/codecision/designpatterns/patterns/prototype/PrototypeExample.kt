package net.codecision.designpatterns.patterns.prototype

import net.codecision.utils.ExampleCommand

class PrototypeExample : ExampleCommand("Prototype") {

    override fun showExample() {

        val iphoneOriginal = Phone("Apple", "Iphone XS", 5.8F)
        println("Iphone original:  $iphoneOriginal")

        val factory = PhoneFactory(iphoneOriginal)
        println("Iphone copy:      ${factory.makeCopy()}")

        val androidOriginal = Phone("OnePlus", "OnePlus 6T", 6.41F)
        println("Android original: $androidOriginal")

        factory.setPrototype(androidOriginal)
        println("Android copy:     ${factory.makeCopy()}")

    }

    class PhoneFactory(private var phone: Phone) {

        fun setPrototype(phone: Phone) {
            this.phone = phone
        }

        fun makeCopy(): Phone = phone.clone()

    }

}