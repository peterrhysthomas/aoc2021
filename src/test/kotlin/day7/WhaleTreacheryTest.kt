package day7

import util.readFileToIntList
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

internal class WhaleTreacheryTest {

    private val positions = listOf(16,1,2,0,4,2,7,1,2,14)

    @Test
    fun testPart1(){
        assertEquals(Pair(2, 37), calculateBestPosition(positions))
    }

    @Test
    fun testPart2(){
        assertEquals(Pair(5, 168), calculateBestPositionPart2(positions))
    }

    @Test
    fun testAnswer(){
        val crabPositions = File("/Users/peter/dev/source/aoc2021/src/test/resources/day7Input.txt").readLines()[0].split(",").map{it.toInt()}
        println("Part 1 = " + calculateBestPosition(crabPositions))
        println("Part 2 = " + calculateBestPositionPart2(crabPositions))
    }
}