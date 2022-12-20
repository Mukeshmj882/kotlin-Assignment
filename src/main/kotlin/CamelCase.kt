fun camelCase(str: String): String {

    var newString = ""


    for (letter in str.indices) {
        if (letter == 0) {
            newString = str[letter].lowercase()
            continue

        }

        if (str[letter - 1] >= 32.toChar() && str[letter - 1] <= 47.toChar()) {

            newString += (str[letter].uppercase())



        } else {
            newString += str[letter].lowercaseChar() //rest of the char converting to lowercase
        }

    }

    return newString.replace("[^a-zA-Z0-9]".toRegex(), "")// Removing Non-Alphanumeric Characters
}


fun main() {
    println(camelCase("A--bC!!Abc gR"))
}