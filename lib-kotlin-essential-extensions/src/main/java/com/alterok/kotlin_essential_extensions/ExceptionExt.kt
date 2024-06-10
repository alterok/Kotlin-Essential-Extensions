package com.alterok.kotlin_essential_extensions

inline fun <T> tryOrNull(tryBlock: () -> T): T? {
    return try {
        tryBlock()
    } catch (e: Exception) {
        null
    }
}


inline fun <T> tryOrDefault(defaultValue: T, tryBlock: () -> T): T {
    return try {
        tryBlock()
    } catch (e: Exception) {
        defaultValue
    }
}

inline fun <T> runCatchingOrDefault(defaultValue: T, tryBlock: () -> T): T {
    return runCatching { tryBlock() }.getOrElse { defaultValue }
}