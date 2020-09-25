package br.com.DigitalHouse.desafio1

class Principal {
}
fun main() {
    val aluno1 = Aluno("Tainá", "Moraes")
    val aluno2 = Aluno("Amanda", "Silva")

    val kotlin = Curso("Kotlin", 1)

    val prof1 = ProfessorAdjunto("Bruna", "Lemos", 4, 1,6)
    val prof2 = ProfessorTitular("Paula", "Souza", 2, 2, "Geografia")

    val aluno1Kotlin = Matricula(aluno1, kotlin)


    aluno1.print()
    aluno2.print()
    prof1.print()
    prof2.print()
    aluno1Kotlin.print()
}