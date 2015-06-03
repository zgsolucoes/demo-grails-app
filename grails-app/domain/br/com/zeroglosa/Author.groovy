package br.com.zeroglosa

class Author {

    String name
    String email

    static hasMany = [books: Book]

    static constraints = {
        name blank: false, unique: true
        email email: true
    }

    String toString(){
        name
    }
}
