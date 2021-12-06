package day3

import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

class BinaryDiagnosticTest {

    val input = listOf("00100",
        "11110",
        "10110",
        "10111",
        "10101",
        "01111",
        "00111",
        "11100",
        "10000",
        "11001",
        "00010",
        "01010")

    @Test
    fun testSumOnes(){
        assertEquals( listOf(7, 5, 8, 7, 5), sumOnes(input),)
    }

    @Test
    fun testPart1(){
        assertEquals( listOf(1, 0, 1, 1, 0), binaryDiagnosticPart1MostCommon(input))
        assertEquals( listOf(0, 1, 0, 0, 1), binaryDiagnosticPart1LeastCommon(input))
    }

    @Test
    fun part1(){
        val binary = File("/Users/peter/dev/source/aoc2021/src/test/resources/day3Input.txt").readLines()
        println("Part 1 Most = " + binaryDiagnosticPart1MostCommon(binary))     // 3516
        println("Part 1 Least = " + binaryDiagnosticPart1LeastCommon(binary))    // 579
    }
}