package petShop

import kotlin.system.exitProcess

class Cachorro(
    private var nome: String? = null,
    private var raca: String? = null,
    private var responsavel: String? = null,
    private var corCachorro: String = "",
    private var temperamentoCachorro: String = ""
) : Animal(
    nome,
    raca,
    responsavel
) {
    private var cor = corCachorro
    private var temperamento = temperamentoCachorro

    internal fun criaCao(): Cachorro {
        val cao: Cachorro = Cachorro(
            nome = "",
            raca = "",
            responsavel = "",
            corCachorro = "",
            temperamentoCachorro = "")

        println("Qual o nome do cachorro?")
        cao.nome = readln()
        println("Qual a raça?")
        cao.raca = readln()
        println("Nome do responsável:")
        cao.responsavel = readln()
        println("Cor da pelagem:")
        cao.cor = readln()
        println("Temperamento:")
        cao.temperamento = readln()

        menuCao()

        return cao
    }

    internal fun menuCao() {
        while (true) {
            println("O que o cão vai fazer?\n" +
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
        println("Andando em 4 patas...\n")
    }

    override fun comer() {
        println("Comendo bife...\n")
    }

    override fun dormir() {
        println("Dormindo na cama da Jéssica!")
    }


}