package com.example.kotlin_classes.abschluss_abgabe

enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Non Fictional stories and novels"),
    SCIENCE("Scientific stories and novels"),
    HISTORY("History stories and novels"),
    CHILDREN("Children stories and novels");

    fun printDescription() {
        println(description)
    }
}