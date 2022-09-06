package com.example.winter20_21

fun main() {
    var myArray = Array(4) { IntArray(3) }

    var zeile1 = arrayOf(144, 233, 45, 9, 3245)
    var zeile2 = arrayOf(234, 278, 24, 5, 124)
    var zeile3 = arrayOf(396, 747, 45, 2, 17979)
    var zeile4 = arrayOf(424, 414, 24, 8, 2115)
    var spilfeld = arrayOf(zeile1,zeile2,zeile3,zeile4)

    println("Bitte option eingeben")
    var option = readln().toInt() -1
    if (option > 5){
        println("Falsche eingabe")
        option =0
    }

    for(zeilen in spilfeld)
    {
        var count =0

        for (feld in zeilen){

            if (count == option){
                print(feld)
                print(".")
            }
            print("0")
            print(".")

            count++
        }
        print("\n")
    }

}