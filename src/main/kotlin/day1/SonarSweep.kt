package main.day1

fun part1(depths: List<Int>) = depths.windowed(2).count{(a,b) -> a < b}

fun part2(depths: List<Int>) = part1(depths.windowed(3).map{it.sum()})

