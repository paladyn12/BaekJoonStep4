package com.example.baekjoonstep4

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var size = nextInt()
    var caseArray : Array<Int>
    for(i in 0..size-1){
        var sum = 0.0
        var mean = 0.0
        var count = 0.000
        var num = nextInt()
        caseArray = Array(num,{0})
        for(j in 0..num-1){
            caseArray[j] = nextInt()
            sum += caseArray[j]
        }
        mean = sum / num
        for(j in 0..num-1) if(caseArray[j]>mean) count++
        var result = ((count / num)*100)
        println(String.format("%.3f%%",result))
    }
}