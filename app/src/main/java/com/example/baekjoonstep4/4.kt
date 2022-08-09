package com.example.baekjoonstep4

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var boolArray = Array(42,{false})
    var sum = 0
    for(i in 0..9) boolArray[nextInt()%42] = true
    for(i in 0..41) if(boolArray[i]==true) sum+=1
    println(sum)
}