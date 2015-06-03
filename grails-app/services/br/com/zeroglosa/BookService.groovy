package br.com.zeroglosa

import grails.transaction.Transactional

@Transactional
class BookService {

    List<Book> searchByTitle(String query) {
        Book.findAllByTitleIlike("%$query%")
    }

    Boolean populate() {
        List<Map> books = [
                [
                        title : 'Book 1',
                        year  : 2011,
                        author: 'Author 1'
                ],
                [
                        title : 'Book 2',
                        year  : 2012,
                        author: 'Author 1'
                ],
                [
                        title : 'Book 3',
                        year  : 2012,
                        author: 'Author 2'
                ],
                [
                        title : 'Book 4',
                        year  : 2013,
                        author: 'Author 3'
                ]
        ]

        Boolean success = books.every { Map bookDefinition ->
            Book book = Book.findOrCreateByTitle(bookDefinition.title)
            book.year = bookDefinition.year

            Author author = Author.findOrCreateByName(bookDefinition.author)
            author.addToBooks(book)

            if (author.validate()) {
                return author.save()
            } else {
                return false
            }
        }

        return success
    }
}
