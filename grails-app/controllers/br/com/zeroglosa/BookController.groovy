package br.com.zeroglosa

class BookController {

    def bookService

    def search() {
        String query = params.query
        List<Book> bookList = bookService.searchByTitle(query)

        [bookList: bookList]
    }

    def populate() {
        Boolean success = bookService.populate()

        String message
        if (success) {
            message = "Livros inseridos com sucesso"
        } else {
            message = "Houce um erro ao persistir"
        }
    }


}
