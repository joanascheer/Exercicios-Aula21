package icarros

fun main() {
    val renault1 = Renault("Kwid", 2022, 35.000, 5, 0.0)

    renault1.darPartida()
    renault1.acelerar()
    renault1.acelerar()
    renault1.acelerar()
    renault1.frear()

    val fiat1 = Fiat ("Uno", 2000, 10.000, 2, 0.0)

    fiat1.darPartida()
    fiat1.acelerar()
    fiat1.acelerar()
    fiat1.acelerar()
    fiat1.acelerar()
    fiat1.frear()
    fiat1.frear()
    fiat1.frear()
    fiat1.frear()

    val hyundai1 = Hyundai("Lindo", 2021, 50.000, 5, 0.0)

    hyundai1.darPartida()
    hyundai1.acelerar()
    hyundai1.acelerar()
    hyundai1.acelerar()
    hyundai1.frear()
    hyundai1.frear()
}