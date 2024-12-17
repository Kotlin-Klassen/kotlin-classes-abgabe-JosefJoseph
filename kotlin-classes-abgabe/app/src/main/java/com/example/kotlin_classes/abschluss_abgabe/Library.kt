package com.example.kotlin_classes.abschluss_abgabe

class Library(val street: String, val city: String, val zipCode: String) {
    public val bookList = mutableListOf<Book>()

    fun printAddress() {
        println("Address: $street, $city, $zipCode")
    }
    fun addBook(book: Book) {
        bookList.add(book)
    }
    fun searchByTitle(title: String): List<Book> {
        return bookList.filter { it.title == title }
    }
    fun searchByAuthor(author: String): List<Book> {
        return bookList.filter { it.author == author }
    }
    fun printBookStatus(book: Book) {
        book.status.printOrderStatus(book.status)
    }

    inner class LibraryMember(val name: String, val memberID: String) {
        fun checkoutBook(book: Book, dueDate: String) {
            book.status = BookStatus.CheckedOut(dueDate)
        }

        fun reserveBook(book: Book) {
            book.status = BookStatus.Reserved(this.name)
        }
    }


}