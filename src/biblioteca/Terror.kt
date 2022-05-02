package biblioteca

class Terror : Livro() {
    fun livrosTerror() {
        registraLivro(9999)
        registraLivro(9999, "I.T")
        registraLivro(9999, "I.T")
        registraLivro(9999, "I.T", "Terror")
        registraLivro(8888, "I.T", "Terror", "Stephen King")
    }

}