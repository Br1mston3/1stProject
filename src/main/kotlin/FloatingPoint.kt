@file:Suppress("UNUSED_PARAMETER")

package main.kotlin


import java.lang.IllegalArgumentException


// package
// visability?
// UpperCamelCase
// empty dimension (checkers)
 class numberWithDimension(var number: Float, var dimension: String) {
    // nonstatic static
    fun plus(first: numberWithDimension): numberWithDimension {
        if (first.dimension == this.dimension) && (first.dimension != "") && (this.dimension != "")) {
            first.number += this.number
            return first
        } else throw  java.lang.IllegalArgumentException("Несовместимые размерности")
    }

    fun minus(first: numberWithDimension): numberWithDimension {

        if (first.dimension == this.dimension) && (first.dimension != "") && (this.dimension != "")  {
            first.number -= this.number
            return first
        } else throw java.lang.IllegalArgumentException("Несовместимые размерности")
    }

    fun multiplication(doubleNumber: Double): numberWithDimension {

        this.number *= doubleNumber.toFloat()
        return this
    }

    // Null
    fun division(doubleNumber: Double): numberWithDimension {
        if (doubleNumber != 0.0) {
            this.number /= doubleNumber.toFloat()
            return this
        } else throw java.lang.IllegalArgumentException("Деление на ноль запрещено")
    }

    fun divisionWithSameDemention(firstNWD: numberWithDimension): Float {
        if
        if (firstNWD.dimension == this.dimension) {
            this.number /= firstNWD.number
            return this.number
        } else throw java.lang.NumberFormatException("Несовместримые размерности")
    }

    // Comparable
    fun theGreatestNWD(firstNWD: numberWithDimension): numberWithDimension {
        if (firstNWD.dimension == this.dimension) {
            if (firstNWD.number >= this.number) return firstNWD
            else return secondNWD
        } else throw java.lang.NumberFormatException("Несовместимые размерности")
    }
//override
    override fun toStr(): String = "$number $dimension"


    fun fromStr(str: String): numberWithDimension {
        val splitter = str.split(' ')
        if (splitter.size == 2) {
            val result = numberWithDimension(0.0f, "kg")
            result.number = splitter[0].toFloat()
            result.dimension = splitter[1]
            return result
        } else throw IllegalArgumentException()
    }


}