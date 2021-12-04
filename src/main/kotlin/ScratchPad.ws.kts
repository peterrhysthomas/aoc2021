import java.io.File

val input = File("/Users/peter/dev/source/adventofcodekt/src/test/resources/day1input.txt").readLines().map{it.toInt()}
val list: List<List<Int>> = input.windowed(2)
println(list)