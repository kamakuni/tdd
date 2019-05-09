/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package money

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AppTest {
    @Test fun testMultiplication() {
        val five = Doller(5)
        val ten = five.times(2)
        assertEquals(10, ten.amount)
        val fifteen = five.times(3)
        assertEquals(15, fifteen.amount)
    }

    @Test fun testEquality() {
        assertTrue(Doller(5).equals(Doller(5)))
    }
}
