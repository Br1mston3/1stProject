package test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


data class numberWithDimension(var number: Float, var dimension: String) {
    val test = numberWithDimension(3.0f,"kg")
    // nonstatic static



        // throws, checkers (good, bad)

        @Test
        fun plus() {
            assertEquals(
                    numberWithDimension(9.0f, "kg"),
                    test.plus(numberWithDimension(6.0f,"kg")
            ))
        }

        @Test
        fun minus() {
            assertEquals(
                    numberWithDimension(2.4f, "kg"),
                    test.minus(numberWithDimension(0.6f, "kg"))
            )
        }

        @Test()
        fun multiplication() {
            assertEquals(numberWithDimension(9.0f, "kg"), test.multiplication(3.0))
        }

        @Test()
        // Division by zero
        fun division() {
            assertEquals(numberWithDimension(1.5f, "kg"), test.division(2.0))


        }

        @Test()
        fun divisionWithSameDemention() {
            assertEquals(1.5f, test.divisionWithSameDemention(numberWithDimension(2.0f, "kg")))
        }

        @Test()
        fun theGreatestNWD() {
            assertEquals(numberWithDimension(4.0f, "kg"), test.theGreatestNWD(numberWithDimension(4.0f, "kg")))
        
        }

        // logic - simple string
        @Test
        fun toStr() {
            assertEquals("3.0f kg", test.toStr())
        }

        @Test
        fun fromStr() {
            assertEquals(numberWithDimension(3.0f, "kg"), test.fromStr())
        }
    }
