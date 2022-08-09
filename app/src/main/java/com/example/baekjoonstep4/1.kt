package com.example.baekjoonstep4

import java.util.*

fun main(Args: Array<String>)=with(Scanner(System.`in`)){
    var size = nextInt()
    var intArray = Array(size,{0})
    var max = -1000000
    var min = 1000000
    for(i in 0..size-1)
        intArray.set(i,nextInt())
    for(i in 0..size-1){
        if(max < intArray[i]) max = intArray[i]
        if(min > intArray[i]) min = intArray[i]
    }
    println("$min $max")
}