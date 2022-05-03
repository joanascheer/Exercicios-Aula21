package banco

import kotlin.system.exitProcess

class ContaSalario(
    private var titular: String? = null,
    private var saldo: Double? = 1212.0,
) : Conta(
    titular,
    saldo
) {

    override fun deposita(): Double? {
        println("Você é a pessoa empregadora?\n" +
                "1 - SIM | 2 - NÃO")
        when (readln()) {
            "1" -> {
                println("Quando você quer depositar?")
                val deposito = readln().toDouble()
                saldo = saldo?.plus(deposito)
                Mensagem.sucesso()
                println("Seu saldo é de $saldo")
            }
            "2" -> {
                Mensagem.erro()
            }
        }

        return saldo
    }

    override fun saca(): Double? {
        println("Digite o valor do saque:")
        val saque = readln().toDouble()
        if (saque > saldo!!) {
            println("Saldo insuficiente. Deseja tentar novamente?\n" +
                    "1 - SIM | 2 - NÃO\n")
            when (readln()) {
                "1" -> {
                    saca()
                }
                "2" -> {
                    exitProcess(0)
                }
            }
        } else
            saldo = saldo?.minus(saque)
        sucesso()
        verSaldo(saldo)
        return saldo
    }


}