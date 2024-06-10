package com.alterok.kotlin_essential_extensions

fun String.removeWhitespaces(): String {
    return this.replace("\\s".toRegex(), "")
}

fun String.isNumeric(): Boolean {
    return this.all { it.isDigit() }
}

fun String.isAlphabetic(): Boolean {
    return this.all { it.isLetter() }
}

fun String.isAlphanumeric(): Boolean {
    return this.all { it.isLetterOrDigit() }
}

fun String.substringOrNull(startIndex: Int, endIndex: Int): String? {
    if (startIndex < 0 || endIndex >= this.length)
        return null

    return this.substring(startIndex, endIndex)
}
