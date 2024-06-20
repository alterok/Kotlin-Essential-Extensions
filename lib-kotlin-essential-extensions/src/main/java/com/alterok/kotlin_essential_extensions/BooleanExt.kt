package com.alterok.kotlin_essential_extensions

inline fun Boolean.ifTrue(block: () -> Unit): Boolean {
    if (this) block()
    return this
}

inline fun Boolean.ifFalse(block: () -> Unit): Boolean {
    if (!this) block()
    return this
}

fun <R> Boolean.evaluate(onTrue: R, onFalse: R): R {
    return if (this)
        onTrue
    else
        onFalse
}

inline fun <R> Boolean.evaluate(onTrue: () -> R, onFalse: () -> R): R {
    return if (this)
        onTrue()
    else
        onFalse()
}

fun Boolean.flip() = !this