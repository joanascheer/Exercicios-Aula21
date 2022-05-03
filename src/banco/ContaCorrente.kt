package banco

import kotlin.system.exitProcess

class ContaCorrente(
    private var titular: String? = null,
    private var saldo: Double? = null
) : Conta(
    titular,
    saldo
) {

    internal fun cadastroContaCorrente() : ContaCorrente {
        println("Titular:")
        objContaCorrente.titular = readln()
        println("Qual saldo deseja informar?")
        objContaCorrente.saldo = readln().toDouble()

        Mensagem.sucesso()
        println("Titular da conta: ${objContaCorrente.titular}")
        println("Saldo: ${objContaCorrente.saldo}")

        return objContaCorrente
    }

    override fun deposita(): Double? {
        println("Qual valor deseja depositar?")
        val deposito = readln().toDouble()
        if (deposito > 5000.0) {
            println("Depósito não realizado. Valor inválido, pois ultrapassa o limite de R$5000,00.\n" +
                    "Favor procurar sua agência.\n" +
                    "Tentar novamente?\n" +
                    "1 - SIM | 2 - NÃO")
            when(readln()) {
                "1" -> {
                    deposita()
                }
                "2" -> {
                    exitProcess(0)
                }
            }
        } else {
            saldo = saldo?.plus(deposito)
            Mensagem.sucesso()
            Mensagem.verSaldo(saldo)
        }
        saldo

        return super.deposita()
    }

    override fun saca(): Double? {
        println("Qual o valor do saque?")
        val saque = readln().toDouble()
        saldo = saldo?.minus(saque)
        sucesso()
        Mensagem.verSaldo(saldo)
        return saldo
    }


    companion object CriaObj {
        val objContaCorrente = ContaCorrente()
    }

}