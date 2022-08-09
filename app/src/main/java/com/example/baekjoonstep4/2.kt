package com.example.baekjoonstep4

import java.util.*

fun main(Args:Array<String>) = with(Scanner(System.`in`)){
    var intArray = Array(9,{0})
    var max = 0
    var maxIndex = 0
    for(i in 0..8) intArray[i] = nextInt()
    for(i in 0..8){
        if(max < intArray[i]){
            max = intArray[i]
            maxIndex = i
        }
    }
    println(max)
    println(maxIndex+1)
}