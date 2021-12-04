package day1

import main.day1.part1
import util.readFileToIntList
import kotlin.test.Test
import kotlin.test.assertEquals

class SonarSweepTest {

    @Test
    fun testDepthCalculation(){
        val depths = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        assertEquals(7, part1(depths))
    }

    @Test
    fun part1(){
        val input = readFileToIntList("/Users/peter/dev/source/adventofcodekt/src/test/resources/day1input.txt")
        println("Part 1 result =  " + part1(input))
    }
}