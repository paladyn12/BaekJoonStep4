package com.example.baekjoonstep4

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var size = nextInt()
    var max = 1.0
    var sum : Double = 0.0
    var scoreArray = Array(size,{0.0})
    for(i in 0..size-1){
        scoreArray[i] = nextDouble()
    }
    for(i in 0..size-1)
        if(max < scoreArray[i]) max = scoreArray[i]
    for(i in 0..size-1){
        scoreArray[i] =(scoreArray[i]/max)*100
        sum += scoreArray[i]
    }
    println(sum/size)
}