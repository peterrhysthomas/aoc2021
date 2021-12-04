package main.day1

fun part1(depths: List<Int>) = depths.windowed(2).count{(a,b) -> a < b}

