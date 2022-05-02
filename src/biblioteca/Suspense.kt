package biblioteca

class Suspense: Livro() {

    fun livrosSuspense() {
        registraLivro(isbn = 8888)
        registraLivro(
            isbn = 8888,
            nomeLivro = "O Iluminado"
        )
        registraLivro(
            isbn = 8888,
            nomeLivro = "O Iluminado",
        )
        registraLivro(
            isbn = 8888,
            nomeLivro = "O Iluminado",
            genero = "Suspense",
        )
        registraLivro(
            8888,"O Iluminado","Suspense","Stephen King"
        )
    }

}