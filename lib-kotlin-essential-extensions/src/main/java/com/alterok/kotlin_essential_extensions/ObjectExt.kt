package com.alterok.kotlin_essential_extensions

fun <T> T?.isNull() = this == null
fun <T> T?.isNotNull() = this != null

inline fun <T> T?.ifNull(block: () -> Unit): T? {
    if (this == null)
        block()
    return this
}

inline fun <T> T?.ifNotNull(block: (T) -> Unit): T? {
    if (this != null)
        block(this)

    return this
}

fun <T> T?.defaultIfNull(defaultValue: T): T {
    return this ?: defaultValue
}

inline fun <T, R> T?.evaluateNullable(onNull: () -> R, onNotNull: (T) -> R): R {
    return if (this == null)
        onNull()
    else
        onNotNull(this)
}

inline fun <reified T> Any?.castOrNull(): T? {
    return this as? T
}