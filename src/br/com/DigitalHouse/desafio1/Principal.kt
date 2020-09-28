package br.com.DigitalHouse.desafio1

class Principal {
}
fun main() {
    val manager = DigitalHouseManager()
    val aluno1 = Aluno("Tainá", "Moraes",1)
    val aluno2 = Aluno("Amanda", "Silva",2)
    val aluno3 = Aluno("Pamela", "Carvalho", 3)

    val android = Curso("Android", 1, 5)
    val kotlin = Curso("Kotlin", 2, 3)
    val java = Curso("Java", 3, 2)

    val prof1 = ProfessorAdjunto("Bruna", "Lemos", 4, 1,6)
    val prof2 = ProfessorTitular("Paula", "Souza", 2, 2, "Geografia")

    manager.registrarCurso(android)
    println("========================")
    manager.registrarCurso(kotlin)
    println("========================")
    manager.registrarCurso(java)
    println("========================")

    //kotlin.adicionarUmAluno(aluno1)

    manager.matricularAluno(aluno1)
    println("========================")
    manager.matricularAluno(aluno2)
    println("========================")
    manager.matricularAluno(aluno3)
    println("========================")

    manager.matricularAlunoCurso(1,3)
    println("========================")
    manager.matricularAlunoCurso(2,3)
    println("========================")
    manager.matricularAlunoCurso(3,2)
    println("========================")
}