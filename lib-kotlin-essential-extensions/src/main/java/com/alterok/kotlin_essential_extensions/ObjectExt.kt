package com.alterok.kotlin_essential_extensions

fun <T> T?.defaultIfNull(defaultValue: T): T {
    return this ?: defaultValue
}

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

inline fun <reified T> Any?.castOrNull(): T? {
    return this as? T
}