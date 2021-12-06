package day3

fun sumOnes(input: List<String>) =  input.map{ it.map{it.toString().toInt()}}.fold(List(input[0].length) {0}) { x, y -> x.zip(y, Int::plus) }

fun binaryDiagnosticPart1MostCommon(input: List<String>) = sumOnes(input).map{ if (it > input.size/2) 1 else 0 }

fun binaryDiagnosticPart1LeastCommon(input: List<String>) = sumOnes(input).map{ if (it < input.size/2) 1 else 0 }