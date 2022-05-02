package icarros

class Fiat(
    marca: String,
    ano: Int,
    valor: Double,
    portas: Int,
    velocidade: Double
) : Carro(
    marca,
    ano,
    valor,
    portas,
    velocidade,
) {
    override fun darPartida(): Double {
        velocidade = 3.0
        println("Iniciando o motor... minha velocidade está em $velocidade\n")
        return velocidade
    }

    override fun acelerar() : Double {
        println("Acelerando, minha velocidade está em $velocidade")
        velocidade += 12.0
        return velocidade
    }

    override fun frear() : Double {
        println("Freando, minha velocidade está em $velocidade")
        velocidade -= 6.0
        return velocidade
    }
}