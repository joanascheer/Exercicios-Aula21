package petShop

fun main() {
    // para brincar cadastrando o animal
    Animal().menuGeral()

    // exemplos
    val cao1: Cachorro = Cachorro("Cachorro", "SRD", "Joana", "Preta", "Dócil")
    val cao2: Cachorro = Cachorro("Canela", "SRD", "Mikael", "Caramelo", "Medrosa")

    cao1.comer()
    cao2.dormir()
    cao1.movimentar()

    val gato1: Gato = Gato("Murissoca", "SRD", "Joana", "Preta", "Dócil")
    val gato2: Gato = Gato("Eustácio", "SRD", "Joana", "Vaquinha", "Dócil")

    gato2.dormir()
    gato1.comer()
    gato2.movimentar()

    val ave1: Passarinho = Passarinho("Dólar", "Calopsita", "Desire", "Amarela", "Sementes")
    val ave2 = Passarinho("Edgard Allan Poe", "Corvo", "Joana", "Preta", "Carne")

    ave1.comer()
    ave2.dormir()
    ave1.movimentar()
}