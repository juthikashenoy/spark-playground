package com.sumo.experiments

import com.nhaarman.mockito_kotlin.mock
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.SubjectSpek
import kotlin.test.assertEquals
import org.jetbrains.spek.api.dsl.*

class WordCountSpec : Spek( {
    given("a WordCountSpec") {
        it("should return the result of adding the first number to the second number") {
            val sum = 2 + 4
            assertEquals(6, sum)
        }
    }
})

open class Calculator {
    fun add(x: Int, y: Int) = x + y
    fun subtract(x: Int, y: Int) = x - y
    fun divide(x: Int, y: Int): Int {
        if (y == 0) {
            throw IllegalArgumentException()
        }
        return x / y
    }
}

class SimpleCalculatorSpec: SubjectSpek<Calculator>({
    subject { Calculator() }

    it("should return the result of adding the first number to the second number") {
        assertEquals(6, subject.add(2, 4))
    }

    it("should return the result of subtracting the second number from the first number") {
        assertEquals(2, subject.subtract(4, 2))
    }
})
