package com.example.kotlin_classes.abschluss_abgabe

sealed class BookStatus {
    object Available : BookStatus()
    data class CheckedOut(val dueDate: String) : BookStatus()
    data class Reserved(val reservedBy: String) : BookStatus()

    fun printOrderStatus(status: BookStatus) {
        when (status) {
            is Available -> println("The Book is available.\n")
            is CheckedOut -> println("The Book will be returned: ${status.dueDate}\n")
            is Reserved -> println("The Book is reserved by: ${status.reservedBy}.\n")
        }
    }
}