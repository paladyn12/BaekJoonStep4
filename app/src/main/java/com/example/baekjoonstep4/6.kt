package com.example.baekjoonstep4

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var size = nextInt()
    nextLine()
    var sum = 0
    var splitArray : Array<String>
    var stringArray = Array(size,{""})
    var scoreArray = Array(size,{0})
    for(i in 0..size-1) stringArray[i] = nextLine()
    for(i in 0..size-1){
        splitArray = stringArray[i].split('X').toTypedArray()
        for(j in 0..splitArray.size-1){
            for(k in 1..splitArray[j].length) sum+=k
        }
        scoreArray[i] = sum
        sum = 0
    }
    for(i in 0..size-1) println(scoreArray[i])
}