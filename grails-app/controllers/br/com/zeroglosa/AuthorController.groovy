package br.com.zeroglosa

class AuthorController {

    def create() {

    }

    def save() {
        Author author = new Author(name: params.name, email: params.email)

        if (author.validate() && author.save()) {
            render "Autor salvo com sucesso. ID: $author.id"
        } else {
            render author.errors.allErrors
        }
    }
}
