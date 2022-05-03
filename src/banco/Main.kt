package banco

import banco.ContaCorrente.CriaObj.objContaCorrente

fun main() {

    // Exemplo criando objeto com cliente inserindo infos
    println("Teste conta corrente 1 \n")
    ContaCorrente().cadastroContaCorrente()
    objContaCorrente.deposita()
    objContaCorrente.saca()

    // Exemplos com objetos já criados
    println("Teste conta corrente 2 \n")
    val objContaCorrente2 = ContaCorrente("Helga Scheer", 20000.0)
    println("Depósito:")
    objContaCorrente2.deposita()
    println("Saque:")
    objContaCorrente2.saca()

    println("***")

    println("Teste conta salário 1\n")
    val objContaSalario = ContaSalario("Joana Scheer", 1212.0)
    println("Depósito:")
    objContaSalario.deposita()
    println("Saque:")
    objContaSalario.saca()
    println("Teste conta salário 2\n")
    val objContaSalario2 = ContaSalario("Gabriel Scheer", 4000.0)
    println("Depósito:")
    objContaSalario2.deposita()
    println("Saque:")
    objContaSalario2.saca()

    println("***")

    println("Teste conta poupança 1\n")
    val objContaPoupanca = ContaPoupanca("Mikael Alexander", 0.0)
    println("Depósito:")
    objContaPoupanca.deposita()
    println("Saque:")
    objContaPoupanca.saca()
    println("Teste conta poupança 2\n")
    val objContaPoupanca2 = ContaPoupanca("Daniel Scheer", 300.0)
    println("Depósito:")
    objContaPoupanca2.deposita()
    println("Saque:")
    objContaPoupanca2.saca()


}