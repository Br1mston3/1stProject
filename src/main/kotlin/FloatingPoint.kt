@file:Suppress("UNUSED_PARAMETER")

package main.kotlin

import java.lang.IllegalArgumentException

data class numberWithDimension(var number: Float, var dimension: String) {

    fun plus(first: numberWithDimension, second: numberWithDimension): numberWithDimension {
        var resultSum = 0.0f
        if (first.dimension == second.dimension) {
            resultSum = first.number + second.number
            first.number = resultSum
            return first
        } else throw  java.lang.IllegalArgumentException("Несовместимые размерности")
    }

    fun minus(first: numberWithDimension, second: numberWithDimension): numberWithDimension {
        var resultDif = 0.0f
        if (first.dimension == second.dimension) {
            resultDif = first.number - second.number
            first.number = resultDif
            return first
        } else throw java.lang.IllegalArgumentException("Несовместимые размерности")
    }

    fun multiplication(firstNWD: numberWithDimension, doubleNumber: Double): numberWithDimension {
        var result = firstNWD
        result.number *= doubleNumber.toFloat()
        return result
    }

    fun division(firstNWD: numberWithDimension, doubleNumber: Double): numberWithDimension {
        firstNWD.number /= doubleNumber.toFloat()
        return firstNWD
    }

    fun divisionWithSameDemention(firstNWD: numberWithDimension, secondNWD: numberWithDimension): Float {
        if (firstNWD.dimension == secondNWD.dimension) {
            firstNWD.number /= secondNWD.number
            return firstNWD.number
        } else throw java.lang.NumberFormatException("Несовместримые размерности")
    }

    fun theGreatestNWD(firstNWD: numberWithDimension, secondNWD: numberWithDimension): numberWithDimension {
        if (firstNWD.dimension == secondNWD.dimension) {
            if (firstNWD.number >= secondNWD.number) return firstNWD
            else return secondNWD
        } else throw java.lang.NumberFormatException("Несовместимые размерности")
    }

    fun toStr(firstNWD: numberWithDimension): String {
        var number = firstNWD.toString()
        var str = firstNWD.dimension
        return "$number $str"
    }

    fun fromStr(str: String): numberWithDimension {
        var splitter = str.split(' ')
        if (splitter.size == 2) {
            var result = numberWithDimension(0.0f, "kg")
            result.number = splitter[0].toFloat()
            result.dimension = splitter[1]
            return result
        } else throw IllegalArgumentException()
    }

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
}