package com.example.winter20_21

fun main() {
    var barcodeArray = Array(10) { IntArray(8) }
    print("Barcode lautet: ")
    //barcodeArray.add("123")
    for (i in 1..10) {

        for (j in 1..9) {


            // Zufallszahl
            val rnd = (1..9).random()
            val rndAbsatz = (21..590).random()

            // Array Initialisieren für Code
         //   barcodeArray.add
        //    barcodeArray[j] = rndAbsatz

            // Zahl an der i'sten Stelle ausgeben
            print(barcodeArray[j])

            // Leerzeichen für Code
            when (j) {
                2 -> {
                    print(" ")
                }
                5 -> {
                    print(" ")
                }
                7 -> {
                    print(" ")
                }
                8 -> {
                    print(" ")
                }
                9 -> {
                    print(" ")
                }
            }
        }
    }
    println()//Platzhalter

}

fun sucheTopSeller(search: Int, vorgabeWert: Int) {

}