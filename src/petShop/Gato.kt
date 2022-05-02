package petShop

import kotlin.system.exitProcess

class Gato (
    private var nome: String? = null,
    private var raca: String? = null,
    private var responsavel: String? = null,
    private var pelagemGato: String = "",
    private var temperamentoGato: String = ""
) : Animal(
    nome,
    raca,
    responsavel
) {
    private var pelagem = pelagemGato
    private var temperamento = temperamentoGato



    internal fun criaGato(): Gato {
        val gatinho: Gato = Gato(
            nome = "",
            raca = "",
            responsavel = "",
            pelagemGato = "",
            temperamentoGato = "")

        println("Qual o nome do gato?")
        gatinho.nome = readln()
        println("Qual a raça?")
        gatinho.raca = readln()
        println("Nome do responsável:")
        gatinho.responsavel = readln()
        println("Cor da pelagem:")
        gatinho.pelagem = readln()
        println("Temperamento:")
        gatinho.temperamento = readln()

        menuGato()

        return gatinho
    }

    internal fun menuGato() {

        while (true) {
            println("O que o gato vai fazer?\n" +
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

    override fun movimentar() {
        println("Andando e saltando em 4 patas...\n")
    }

    override fun comer() {
        println("Comendo Whiskas Sachê...\n")
    }

    override fun dormir() {
        println("Dormindo na caixa!")
    }
}