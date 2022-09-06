package com.example.winter20_21

fun main() {

    val barcodeArray = IntArray(9)
    print("Barcode lautet: ")

    for (i in 0..8) {

        // Zufallszahl
        val rnd = (1..9).random()

        // Array Initialisieren für Code
        barcodeArray[i] = rnd

        // Zahl an der i'sten Stelle ausgeben
        print(barcodeArray[i])

        // Leerzeichen für Code
        when (i) {
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
        }

    }
    println()//Platzhalter

    // Aufgabe funktion ermittle prüffziffer
    ermittlePrueffziffer(barcodeArray)
}


fun ermittlePrueffziffer(barcode: IntArray):Int{
    var wert = 0
    for ( i in 0.. barcode.lastIndex){
        if (i % 2  ==  0 ){
            wert += barcode[i]
        }else {
            wert += barcode[i] * 3
        }
    }
    wert %= 10
    println("Cheksum wert ist: $wert")
    return wert
}
