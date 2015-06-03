package br.com.zeroglosa

import grails.transaction.Transactional

@Transactional
class BookService {

    List<Book> searchByTitle(String query) {
        Book.findAllByTitleIlike("%$query%")
    }
}
