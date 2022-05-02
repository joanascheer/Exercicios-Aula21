package biblioteca

import kotlin.system.exitProcess

open class Livro(
    nome: String? = null,
    isbn: String? = null,
    pessoaAutora: String? = null,
    genero: String? = null,
) {

    open fun registraLivro(isbn: Int) {
        println("O livro foi registrado com o ISBN $isbn\n")
    }

    open fun registraLivro(isbn: Int, nomeLivro: String) {
        println("O livro foi registrado com o ISBN $isbn e nome: $nomeLivro\n")
    }

    open fun registraLivro(isbn: Int, nomeLivro: String, genero: String) {
        println("O livro foi registrado com o ISBN: $isbn, nome: $nomeLivro e gênero: $genero\n")
    }

    open fun registraLivro(isbn: Int, nomeLivro: String, generos: String, pessoaAutora: String) {
        println("O livro foi registrado com o ISBN: $isbn, nome: $nomeLivro, gênero: $generos e pessoa autora: $pessoaAutora\n")
    }



}