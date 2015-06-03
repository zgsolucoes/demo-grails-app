package br.com.zeroglosa

class Book {

    String title
    BigInteger year

    Book equivalent

    static belongsTo = [author: Author]

    static constraints = {
        title unique: true
        equivalent nullable: true
    }
}
