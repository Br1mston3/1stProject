package main.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import java.lang.Math.ulp

fun main() {
    val test = numberWithDimension(2.0f, "kg")
    println(plus(test, test))
    println(minus(test, test))
    println(multiplication(test, 2.0))
    println(division(test, 2.0))
    println(divisionWithSameDemention(test, test))
    println(theGreatestNWD(test, numberWithDimension(1.0f, "kg")))
    println(toStr(test))
    println(fromStr("2.0f kg"))
}
class Tests {

            /* @Test
    fun plus() {
        assertEquals(
                numberWithDemention(1.2f, "kg"),
                plus(numberWithDemention(0.6f, "kg"), numberWithDemention(0.6f, "kg"))
        )
    }
    @Test
    fun minus() {
        assertEquals(
                numberWithDemention(0.0f, "kg"),
                minus(numberWithDemention(0.6f, "kg"), numberWithDemention(0.6f, "kg"))
        )
    }

    @Test()
    fun multiplication() {
        assertEquals(numberWithDemention(6.0f, "kg"), multiplication(numberWithDemention(2.0f, "kg"), 3.0))
    }

    @Test()
    fun division() {
        assertEquals(numberWithDemention(1.5f, "kg"), multiplication(numberWithDemention(3.0f, "kg"), 2.0))
    }

    @Test()
    fun divisionWithSameDemention() {
        assertEquals(1.5f, divisionWithSameDemention(numberWithDemention(3.0f, "kg"), numberWithDemention(2.0f, "kg")))
    }

    @Test()
    fun theGreatestNWD() {
        assertEquals(numberWithDimenton(4.0f, "kg"), theGreatestNWD(numberWithDimention(4.0f, "kg"), numberWithDimention(
                2.0f,
                "kg"
        )))
    }

    @Test
    fun toStr() {
        assertEquals("3.0f kg", toStr(numberWithDimention(3.0f, "kg")))
    }

    @Test
    fun fromStr() {
        assertEquals(numberWithDimention(3.0f, "kg"), fromStr("3.0f kg"))
    }
*/
   }