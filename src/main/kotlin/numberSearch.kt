
fun numberSearch(str: String): String {
        var totalNumber = 0
    var totalLetters = 0

    for (x in str.indices) {
        if ((str[x] in 'a'..'z') || (str[x] in 'A'..'Z'))
        {
            totalLetters++
        }
        else if (str[x] in '0'..'9')
        {
            totalNumber += str[x].toInt()-48
        }

    }
    val sum = totalNumber/totalLetters



    println(sum)
        // code goes here
            return str;

    }

    fun main() {
        println(numberSearch("H3ello9-9"))
    }