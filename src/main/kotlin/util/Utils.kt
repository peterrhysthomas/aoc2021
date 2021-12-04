package util

import java.io.File


fun readFileToIntList(filename: String): List<Int> = File(filename).readLines().map{it.toInt()}