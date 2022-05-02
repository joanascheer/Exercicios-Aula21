package icarros

import kotlin.math.sign


class Renault(
    marca: String,
    ano: Int,
    valor: Double,
    portas: Int,
    velocidade: Double,
) : Carro(
    marca,
    ano,
    valor,
    portas,
    velocidade,
) {


    override fun darPartida(): Double {
        velocidade = 0.0
        println("Iniciando o motor... minha velocidade é igual a $velocidade")
        return velocidade
    }

    override fun acelerar(): Double {
        velocidade += 10.0
        println("Acelerando, minha velocidade está em $velocidade")
        return velocidade
    }

    override fun frear(): Double {
        velocidade -= 5.0
        println("Freando...minha velocidade está em $velocidade")

        return velocidade
    }


}
