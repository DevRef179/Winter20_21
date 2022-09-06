package com.example.winter20_21

fun main() {

    var twoD = Array(10, { IntArray(9) })
    var num = 10
    for (i in twoD.indices){

        var coolArray = IntArray(8)
        for (j in coolArray.indices){
            coolArray[j] = num ++
           // coolArray[j]= max
        }
        twoD[i]=coolArray
        println(twoD[i].size)
    }
}

/*

package com.example.winter20_21

fun main() {

    var twoD = Array(10, { IntArray(9) })

    /*
    for (i in twoD.indices){

        var coolArray = IntArray(8)
        for (j in coolArray.indices){
            coolArray[j] = num
           // coolArray[j]= max
        }
        twoD[i]=coolArray
    }

     */



    for (coolArray in twoD) {
        var count = 0
        for (j in coolArray) {
            var num = (1..9).random()
            var max = (22..940).random()

            print(num)
            print(" ")
            if (count<9){
                print(max)
            }

            when (count) {
                2 -> {
                    print(" - ")
                }
                5 -> {
                    print(" - ")
                }
                7 -> {
                    print(" - ")
                }
                8 -> {
                    print(" - ")
                }
                9 -> {
                    print(" - ")
                }
                in 9..940 -> {
                    print(max)
                }


            }
            count ++
        }
        println(" ")

    }

}


 */