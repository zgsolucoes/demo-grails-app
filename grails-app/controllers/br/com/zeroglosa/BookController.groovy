package br.com.zeroglosa

class BookController {
    static scaffold = true

    def bookService

    def search() {
        String query = params.query
        List<Book> bookList = bookService.searchByTitle(query)

        [bookList: bookList]
    }
}
