package com.alterok.kotlin_essential_extensions

fun <T> T.toList() = listOf(this)

fun <T> T.toMutableList() = mutableListOf(this)