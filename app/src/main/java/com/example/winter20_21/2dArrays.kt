package com.example.winter20_21

fun main() {
    var num = 10
    var twoD = Array(4) { IntArray(3) }
    twoD
    for (i in twoD.indices) {
        var colArray = IntArray(3)
        for (j in colArray.indices) {
            num = num+1
            colArray[j] = num
            // coolArray[j]= max
        }
        twoD[i] = colArray
    }

    for(colArray in twoD){
        for (j in colArray) {
            print(j)
            print(" ")
        }
        println(" ")
    }
}