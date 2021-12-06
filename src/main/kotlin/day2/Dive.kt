package day2

fun divePart1(instructions: List<String>): Pair<Int, Int> = instructions.flatMap{it -> it.split(" ")}
    .windowed(2, 2)
    .map{Pair(it[0], it[1].toInt())}
    .fold(Pair<Int,Int>(0, 0)) { coord, it ->
        when (it.first) {
            "forward" -> Pair(coord.first + it.second, coord.second)
            "down" -> Pair(coord.first, coord.second + it.second)
            "up" -> Pair(coord.first, coord.second - it.second)
            else -> Pair(coord.first, coord.second)
        }
    }

fun divePart2(instructions: List<String>): Pair<Int, Int>  {
    val position = instructions.flatMap{it -> it.split(" ")}
        .windowed(2, 2)
        .map{Pair(it[0], it[1].toInt())}
        .fold(Triple<Int,Int, Int>(0, 0, 0)) { coord, it ->
            when (it.first) {
                "forward" -> Triple(coord.first + it.second, coord.second + (it.second * coord.third), coord.third)
                "down" -> Triple(coord.first, coord.second, coord.third + it.second)
                "up" -> Triple(coord.first, coord.second, coord.third - it.second)
                else -> Triple(coord.first, coord.second, coord.third)
            }
        }
    return Pair(position.first, position.second)
}