package petShop

import kotlin.system.exitProcess

class Passarinho(
    private var nome: String? = null,
    private var raca: String? = null,
    private var responsavel: String? = null,
    private var corPassaro: String = "",
    private var alimentacaoPassaro: String = ""
) : Animal(
    nome,
    raca,
    responsavel
) {
    private var cor = corPassaro
    private var alimentacao = alimentacaoPassaro


    internal fun criaPassaro(): Passarinho {
        val passarinho: Passarinho = Passarinho(
            nome,
            raca,
            responsavel,
            cor,
            alimentacao)

        println("Qual o nome do passarinho?")
        passarinho.nome = readln()
        println("Qual a raça?")
        passarinho.raca = readln()
        println("Nome do responsável:")
        passarinho.responsavel = readln()
        println("Cor da penugem:")
        passarinho.corPassaro = readln()
        println("Alimentação:")
        passarinho.alimentacao = readln()

        menuPassaro()

        return passarinho
    }

    internal fun menuPassaro() {

        while (true) {
            println("O que o pássaro vai fazer?\n" +
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
        println("Sou um pássaro meio peixe, então estou nadando...\n")
    }

    override fun comer() {
        println("Comendo ração molhada porque sou um pássaro diferenciado.\n")
    }

    override fun dormir() {
        println("Dormindo de olho aberto com medo do gato!")
    }
}
