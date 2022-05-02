package biblioteca

class Utopia : Livro() {

    fun livrosUtopia() {
        registraLivro(1000)
        registraLivro(1000, "História Sem Fim")
        registraLivro(1000, "História Sem Fim")
        registraLivro(1000, "História Sem Fim", "Utopia")
        registraLivro(1000, "História Sem Fim", "Utopia", "Steven Spielberg")
    }

}