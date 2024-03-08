val materiasENotas = mutableMapOf<String, MutableList<Double>>()

fun adicionarDisciplina(materia: String, notas: MutableList<Double> = mutableListOf()): Boolean {
    return materiasENotas.put(materia, notas) != null
}

fun adicionarNota(materia: String, nota: Double): Boolean {
    val notasDaMateria = materiasENotas[materia]

    return if (notasDaMateria != null) {
        notasDaMateria.add(nota)
        true
    } else {
        false
    }
}

fun mostrarNotas(materia: String) {
    if (!materiasENotas.containsKey(materia)) {
        println("Matéria $materia não encontrada")
    } else {
        val notasDaMateria = materiasENotas[materia]
        if (notasDaMateria != null) {
            println("Matéria: $materia")
            var cont = 1
            for (nota in notasDaMateria) {
                println("Nota $cont: $nota")
                cont++
            }
        } else {
            println("Não foi possível mostrar as notas da matéria $materia")
        }
    }
}


fun calcularMedia(notas: List<Double>): Double {
    var soma = 0.0
    for (nota in notas) {
        soma += nota
    }
    return soma / notas.size
}

fun adicionarVariasNotas(materia: String, vararg nota: Double): Boolean {
    val notasDaMateria = materiasENotas[materia] ?: return false
    for (n in nota) {
        notasDaMateria.add(n)
    }
    return true
}

fun main() {
    adicionarDisciplina("Matemática")
    adicionarDisciplina(materia = "Português")
    adicionarDisciplina("História")

    adicionarNota("Matemática", 8.0)
    adicionarNota("Português", 7.5)
    adicionarNota("História", 9.0)

    mostrarNotas("Matemática")
    mostrarNotas("Português")
    mostrarNotas("História")

    adicionarDisciplina("Geografia")

    adicionarVariasNotas("Geografia", 6.0, 5.5, 7.0)

    mostrarNotas("Geografia")
}
