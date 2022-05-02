package biblioteca

class Ficcao: Livro() {

    fun livrosFiccao() {
        registraLivro(2000)
        registraLivro(2000, "Contato")
        registraLivro(2000, "Contato")
        registraLivro(2000, "Contato", "Ficção")
        registraLivro(2000, "Contato", "Ficção", "Joana Scheer")
    }

}