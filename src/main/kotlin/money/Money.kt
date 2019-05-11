/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package money

abstract class Money(open val amount: Int) {
    companion object {
        fun dollar(amount: Int) = Dollar(amount)
        fun franc(amount: Int) = Franc(amount)
    }
    override fun equals(other: Any?) = (other is Money) && amount == other.amount && this::class.simpleName == other::class.simpleName
    abstract fun times(multiplier: Int): Money
}

class Dollar(override val amount: Int): Money(amount) {
    override fun times(multiplier: Int): Money = Dollar(amount * multiplier)
}

class Franc(override val amount: Int): Money(amount) {
    override fun times(multiplier: Int): Money = Franc(amount * multiplier)
}

fun main(args: Array<String>) {
    println("Nothing")
}
