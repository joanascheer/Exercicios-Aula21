package banco

class ContaPoupanca(
    private var titular: String? = null,
    private var saldo: Double? = 0.0,
) : Conta(
    titular,
    saldo
) {

    override fun deposita(): Double? {
        println("Que valor deseja guardar?")
        val dinheiroGuardado = readln().toDouble()
        saldo = saldo?.plus(dinheiroGuardado)
        val rendimento = dinheiroGuardado * 0.1
        Mensagem.sucesso()
        println("Você guardou $dinheiroGuardado. Seu saldo é de $saldo e seu rendimento será de $rendimento")
        return saldo
    }

    override fun saca(): Double? {
        println("Que valor deseja sacar?")
        val saquePoupanca = readln().toDouble()
        if (saquePoupanca > saldo!!) {
            println("Tem certeza? Você não estava economizando?\n" +
                    "1 - SIM | 2 - NÃO")
            when (readln()) {
                "1" -> {
                    saldo = saldo?.minus(saquePoupanca)
                    Mensagem.sucesso()
                    Mensagem.verSaldo(saldo)
                }
                "2" -> {
                    println("Parabéns, estou orgulhosa de ti!")
                }
            }

        } else
            saldo = saldo?.minus(saquePoupanca)
        Mensagem.sucesso()
        Mensagem.verSaldo(saldo)

        return saldo
    }


}