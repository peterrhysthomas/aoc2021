package day2

import util.readFileToIntList
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

internal class DiveKtTest{

    val input = listOf("forward 5",
        "down 5",
        "forward 8",
        "up 3",
        "down 8",
        "forward 2")

    @Test
    fun testPart1(){
        assertEquals(Pair(15, 10), divePart1(input))
    }

    @Test
    fun testPart2(){
        assertEquals(Pair(15, 60), divePart2(input))
    }

    @Test
    fun results(){
        val instructions = File("/Users/peter/dev/source/aoc2021/src/test/resources/day2Input.txt").readLines()
        println("Part 1 results = " + divePart1(instructions))
        println("Part 2 results = " + divePart2(instructions))
    }
}