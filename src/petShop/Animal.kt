package petShop

import kotlin.system.exitProcess

open class Animal(
    private var nome: String? = null,
    private var raca: String? = null,
    private var responsavel: String? = null,
) {
    var nomeAnimal = nome
    var racaAnimal = raca
    var responsavelAnimal = responsavel

    open fun movimentar() {
        println("Movimentando")
    }

    open fun comer() {
        println("Comendo")
    }

    open fun dormir() {
        println("Dormindo")
    }

    fun menuGeral() {

        while (true) {
            println("Qual animal deseja registrar?\n" +
                    "1 - Cão | 2 - Gato | 3 - Pássaro\n" +
                    "4 - Nenhum, quero sair do sistema.")
            when(readln()) {
                "1" -> {
                    Cachorro().criaCao()
                }
                "2" -> {
                    Gato().criaGato()
                }
                "3" -> {
                    Passarinho().criaPassaro()
                }
                "4" -> {
                    println("Até mais!")
                    exitProcess(0)
                }

            }
        }
    }

    open fun acoes() {
        while (true) {
            println("O que o seu animal vai fazer?\n" +
                    "1 - Movimentar\n" +
                    "2 - Comer\n" +
                    "3 - Dormir\n" +
                    "4 - Sair do sistema\n")
            when (readln()) {
                "1" -> {
                    movimentar()
                }
                "2" -> {
                    comer()
                }
                "3" -> {
                    dormir()
                }
                "4" -> {
                    exitProcess(0)
                }
            }
        }
    }
}