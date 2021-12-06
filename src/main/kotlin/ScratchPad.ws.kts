
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

input.map{ it.map{it}}
val t = input.map{ it.map{it.toString().toInt()}}


fun List<Int>.padTo(requiredSize: Int) =
    if (size < requiredSize) {
        plus(generateSequence { 0 }.take(requiredSize - size))
    } else {
        this
    }

//val initial =

fun sumVariableLists(xs: List<List<Int>>): List<Int> =
    xs.fold(List(input[0].length) {0}) { x, y ->
        x.zip(y, Int::plus)
    }

sumVariableLists(t).map{ if (it > input.size/2) 1 else 0 }


