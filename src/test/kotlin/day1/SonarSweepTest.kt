package day1

import main.day1.*
import util.readFileToIntList
import kotlin.test.Test
import kotlin.test.assertEquals

class SonarSweepTest {

    val depths = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

    @Test
    fun testPart1(){
        assertEquals(7, part1(depths))
    }

    @Test
    fun testPart2(){
        assertEquals(5, part2(depths))
    }

    @Test
    fun results(){
        val input = readFileToIntList("/Users/peter/dev/source/aoc2021/src/test/resources/day1input.txt")
        println("Part 1 result =  " + part1(input))
        println("Part 2 result =  " + part2(input))
    }
}