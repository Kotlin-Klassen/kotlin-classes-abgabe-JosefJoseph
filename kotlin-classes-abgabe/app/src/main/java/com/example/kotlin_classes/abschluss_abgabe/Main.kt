package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    val library = Library("123 Main Street", "Cityville", "12345")
    library.printAddress()
    library.addBook(book = Book("Kotlin Programming", "John Doe", Genre.FICTION, BookStatus.Available))
    library.addBook(book = Book("Java Programming", "Kurz", Genre.FICTION, BookStatus.Available))
    library.addBook(book = Book("Python Programming", "Hans", Genre.FICTION, BookStatus.Available))
    library.addBook(book = Book("C Programming", "Heil", Genre.FICTION, BookStatus.Available))
    library.LibraryMember("Max", "123").checkoutBook(library.bookList[0], "2023-12-31")
    library.LibraryMember("Max", "123").reserveBook(library.bookList[1])
    library.searchByTitle("Kotlin Programming")
    library.searchByAuthor("Kurz")
    library.printBookStatus(library.bookList[0])
    library.printBookStatus(library.bookList[1])
}
