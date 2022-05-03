package banco

open class Conta (
    private var titular: String? = null,
    private var saldo: Double? = null
) {

    private var deposito = 0.0
    private var saque = 0.0

    open fun deposita() : Double? {
        return saldo
    }

    open fun saca() : Double? {
        return saldo
    }


    companion object Mensagem {
        internal fun sucesso() {
            println("Operação efetuada com sucesso!")
        }

        fun erro() {
            println("Apenas a pessoa empregadora pode concluir esta solicitação.\n")
        }

        fun verSaldo(saldo: Double?) {
            println("Seu saldo é de $saldo")
        }
    }
}