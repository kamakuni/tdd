/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package money

open class Money(open val amount: Int, open val currency: String) {
    public companion object {
        fun dollar(amount: Int) = Money(amount, "USD")
        fun franc(amount: Int) = Money(amount, "CHF")
    }
    override fun equals(other: Any?) = (other is Money) && amount == other.amount && this.currency == other.currency
    fun times(multiplier: Int): Money = Money(amount * multiplier, currency)
    public fun currency():String = currency
    override fun toString(): String = "${amount} ${currency}"
}

class Dollar(override val amount: Int, override val currency: String): Money(amount, currency) {}

class Franc(override val amount: Int, override val currency: String) : Money(amount, currency) {}

fun main(args: Array<String>) {
    println("Nothing")
}
