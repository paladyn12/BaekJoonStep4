package com.example.baekjoonstep4

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var A = nextInt()
    var B = nextInt()
    var C = nextInt()
    var result = A*B*C
    var countArray = Array(10,{0})
    while(result>10){
        countArray[result%10]++
        result/=10
    }
    countArray[result]++
    for(i in 0..9) println(countArray[i])
}