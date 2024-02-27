package org.example

fun main() {
    var firstString: String? = ""
    var SecondString: String? = ""

    print("enter firstString: ")
    firstString = readLine().toString()

    print("enter SecondString: ")
    SecondString = readLine().toString()

    var uniqueFirst = ""

    for (i in firstString.indices) {
        var flag = 0


        for (j in firstString.indices){

            if (firstString[i] == firstString[j] && i != j) {
                flag = 1
                break;
            }
            }


    if (flag == 0)
        uniqueFirst += firstString[i]


}
    println(uniqueFirst)

var uniqueScond = ""
    for (a in SecondString.indices) {
        var flag1 = 0


        for (b in SecondString.indices){

            if (SecondString[a] == SecondString[b] && a != b) {
                flag1 = 1
                break;
            }
        }


        if (flag1 == 0)
            uniqueScond += SecondString[a]


    }
    println(uniqueScond)

    var combine = firstString.plus(SecondString)
    var uniquecom = ""
    for (c in combine.indices) {
        var flag2 = 0


        for (d in combine.indices){

            if (combine[c] == combine[d] && c != d) {
                flag2 = 1
                break;
            }
        }


        if (flag2 == 0)
            uniquecom += combine[c]


    }
    println(uniquecom)



}

