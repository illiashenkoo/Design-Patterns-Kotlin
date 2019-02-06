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

    protected fun printEmptyLine() {
        println("")
    }

    private fun printStartLine() {
        println("========== ${patternName} ==========")
    }

    private fun printFinishLine() {
        println("========== /${patternName} ==========")
        printEmptyLine()
    }

}