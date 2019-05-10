/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package money

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

class Doller(val amount: Int){ // TODO limit scope
    fun times(multiplier: Int): Doller = Doller(amount * multiplier)
    override fun equals(other: Any?) = (other is Doller) && amount == other.amount
}

fun main(args: Array<String>) {
    println(App().greeting)
}
