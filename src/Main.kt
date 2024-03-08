import kotlin.math.PI

// Questão 1
class Produto(var nome: String, var preco: Double) {

    constructor() : this("Produto", 0.0)


    constructor(nome: String) : this(nome, 0.0)
}

fun main() {
    // Instância da classe Produto utilizando o construtor sem parâmetros
    val produto1 = Produto()
    println("Produto 1 - Nome: ${produto1.nome}, Preço: ${produto1.preco}")

    // Instância da classe Produto utilizando o construtor que recebe apenas o nome
    val produto2 = Produto("Produto 2")
    println("Produto 2 - Nome: ${produto2.nome}, Preço: ${produto2.preco}")

    // Instância da classe Produto utilizando o construtor que recebe nome e preço
    val produto3 = Produto("Produto 3", 10.0)
    println("Produto 3 - Nome: ${produto3.nome}, Preço: ${produto3.preco}")
}



//Questão 2
class Cliente(public val nome: String, private val idade: Int) {
    fun mostrarIdade() {
        println("A idade do cliente é $idade")
    }
}

fun main() {
    val cliente = Cliente("João", 30)
    cliente.mostrarIdade()
}
//Questão 3

abstract class Personagem {
    abstract fun atacar()
}


class Guerreiro : Personagem() {
    override fun atacar() {
        println("O Guerreiro ataca com sua espada!")
    }
}


class Mago : Personagem() {
    override fun atacar() {
        println("O Mago lança um feitiço!")
    }
}

fun main() {

    val guerreiro = Guerreiro()
    guerreiro.atacar()


    val mago = Mago()
    mago.atacar()
}

//Questão 4

// Interface FormaGeometrica
interface FormaGeometrica {
    fun calcularArea(): Double
}

//Retangulo
class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return altura * largura
    }
}

//Circulo
class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return PI * raio * raio
    }
}

fun main() {
    // Instância de Retangulo
    val retangulo = Retangulo(5.0, 10.0)
    println("Área do Retângulo: ${retangulo.calcularArea()}")

    // Instância de Circulo
    val circulo = Circulo(3.0)
    println("Área do Círculo: ${circulo.calcularArea()}")
}

//Questão 5

class ContaBancaria(var numeroConta: String, private var _nomeTitular: String, saldo: Double) {
    var saldo: Double = saldo
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                field = 0.0
            }
        }

    var nomeTitular: String
        get() = _nomeTitular.capitalize()
        set(value) {
            _nomeTitular = value
        }
}

fun main() {
    val conta = ContaBancaria("123456", "joão", 100.0)

    conta.nomeTitular = "maria" // Alterando o nome para iniciar com letra minúscula
    conta.saldo = -50.0 // Alterando o saldo para um valor negativo

    println("Número da Conta: ${conta.numeroConta}")
    println("Nome do Titular: ${conta.nomeTitular}")
    println("Saldo: ${conta.saldo}")
}




