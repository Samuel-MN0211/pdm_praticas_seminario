
open class Funcionario(val nome: String, val idade: Int) {
    init {
        println("Novo funcionário registrado - Nome: $nome, Idade: $idade")
    }

    open fun apresentar() {
        println("Funcionário: $nome, Idade: $idade")
    }
}


class Gerente(nome: String, idade: Int, val setor: String) : Funcionario(nome, idade) {
    override fun apresentar() {
        println("Gerente: $nome, Idade: $idade, Setor: $setor")
    }
}


class Desenvolvedor(nome: String, idade: Int, val linguagem: String) : Funcionario(nome, idade) {
    override fun apresentar() {
        println("Desenvolvedor: $nome, Idade: $idade, Linguagem: $linguagem")
    }
}


class Analista(nome: String, idade: Int, val area: String) : Funcionario(nome, idade) {
    override fun apresentar() {
        println("Analista: $nome, Idade: $idade, Área: $area")
    }
}

fun main() {

    val funcionarios = listOf(
        Gerente("João", 35, "TI"),
        Desenvolvedor("Maria", 28, "Java"),
        Analista("Pedro", 30, "Qualidade")
    )


    for (funcionario in funcionarios) {
        when (funcionario) {
            is Gerente -> funcionario.apresentar()
            is Desenvolvedor -> funcionario.apresentar()
            is Analista -> funcionario.apresentar()
            else -> funcionario.apresentar()
        }
    }
}
