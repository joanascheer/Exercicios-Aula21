package icarros

open class Carro(
    private var marca: String = "",
    private var ano: Int = 0,
    private var valor: Double = 0.0,
    private var portas: Int = 0,
    protected var velocidade: Double = 0.0,
) {
    open fun darPartida(): Double {
        println("Dando a partida...")
        return velocidade
    }

    open fun acelerar(): Double {
        return velocidade

    }

    open fun frear(): Double {
        return velocidade
    }
}