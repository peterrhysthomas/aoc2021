import java.io.File

val input = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
val list: List<Int> = input.windowed(3).map{it.sum()}
println(list)