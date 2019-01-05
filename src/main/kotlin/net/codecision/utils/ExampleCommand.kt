package net.codecision.utils

abstract class ExampleCommand(
    private val patternName: String
) {

    fun execute() {
        printStartLine()

        showExample()

        printFinishLine()
    }

    protected abstract fun showExample()

    private fun printStartLine() {
        println("========== ${patternName} ==========")
    }

    private fun printFinishLine() {
        println("========== /${patternName} ==========\n")
    }

}