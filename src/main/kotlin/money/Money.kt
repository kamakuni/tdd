/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package money

open class Money(open val amount: Int) {
    override fun equals(other: Any?) = (other is Money) && amount == other.amount
}

class Doller(override val amount: Int): Money(amount) {
    fun times(multiplier: Int): Doller = Doller(amount * multiplier)
}

class Franc(override val amount: Int): Money(amount) {
    fun times(multiplier: Int): Franc = Franc(amount * multiplier)
}

fun main(args: Array<String>) {
    println("Nothing")
}
