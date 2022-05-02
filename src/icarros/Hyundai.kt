package icarros

import javax.swing.text.StyledEditorKit.BoldAction

class Hyundai(
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
        velocidade = 5.0
        println("Iniciando o motor... minha velocidade está em $velocidade")
        return velocidade
    }

    override fun acelerar() : Double {
        println("Acelerando, minha velocidade está em $velocidade")
        velocidade += 15.0
        return velocidade
    }

    override fun frear(): Double {
        println("Freando, minha velocidade está em $velocidade")
        velocidade -= 2.0
        return velocidade
    }

}