package day7

fun calculateBestPosition(positions: List<Int>): Pair<Int, Int> {
    fun calcLeast(current: Pair<Int, Int>, positions: List<Int>, possiblePos: Int): Pair<Int, Int> {
        val moves = positions.map{ Math.abs(possiblePos - it) }.sum()
        if (current.second > moves){
            return Pair(possiblePos, moves)
        } else {
            return current
        }
    }

    val possible = 0..positions.maxOrNull()!!

    return possible.drop(1).fold(Pair<Int, Int>(possible.first, positions.map{ Math.abs(0 - it) }.sum())){
            curr, poss -> calcLeast(curr, positions, poss)
    }
}

fun calculateBestPositionPart2(positions: List<Int>): Pair<Int, Int> {
    fun calcFuel(steps: Int): Int = (0..steps).sum()

    fun calcLeast(current: Pair<Int, Int>, positions: List<Int>, possiblePos: Int): Pair<Int, Int> {
        val moves = positions.map{ calcFuel(Math.abs(possiblePos - it)) }.sum()
        if (current.second > moves){
            return Pair(possiblePos, moves)
        } else {
            return current
        }
    }

    val possible = 0..positions.maxOrNull()!!

    return possible.drop(1).fold(Pair<Int, Int>(possible.first, positions.map{ calcFuel(Math.abs(0 - it)) }.sum())){
            curr, poss -> calcLeast(curr, positions, poss)
    }
}