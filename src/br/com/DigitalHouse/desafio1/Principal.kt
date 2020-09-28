package br.com.DigitalHouse.desafio1

class Principal {
}
fun main() {
    val manager = DigitalHouseManager()
    val aluno1 = Aluno("Tainá", "Moraes")
    val aluno2 = Aluno("Amanda", "Silva")

    val android = Curso("Android", 1, 5)
    val kotlin = Curso("Kotlin", 2, 3)
    val java = Curso("Java", 3, 2)

    val prof1 = ProfessorAdjunto("Bruna", "Lemos", 4, 1,6)
    val prof2 = ProfessorTitular("Paula", "Souza", 2, 2, "Geografia")

    //val aluno1Kotlin = Matricula(aluno1, kotlin)

//    manager.registrarProfessorAdjunto(prof1)
//    manager.listaProfPrint()
//    println("-----------------------------")
//    manager.registrarProfessorTitular(prof2)
//    manager.listaProfPrint()
//    println("-----------------------------")
//    manager.excluirProfessor(1)
//    manager.listaProfPrint()

//    manager.registrarCurso(android)
//    manager.registrarCurso(kotlin)
//    manager.registrarCurso(java)
//
//    println("--------ANTES EXCLUSÃO-----")
//    manager.listaCursosPrint()
//
//    println("-----------EXLUSÃO---------")
//    manager.excluirCurso(1)
//
//    println("------DEPOIS EXCLUSÃO------")
//    manager.listaCursosPrint()



}