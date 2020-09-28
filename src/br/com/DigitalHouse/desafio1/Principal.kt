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

    //val prof1 = ProfessorAdjunto("Bruna", "Lemos", 4, 1,6)
    //val prof2 = ProfessorTitular("Paula", "Souza", 2, 2, "Geografia")

    //val aluno1Kotlin = Matricula(aluno1, kotlin)

    manager.registrarCurso(android)
    manager.registrarCurso(kotlin)
    manager.registrarCurso(java)

    println("--------ANTES EXCLUSÃO-----")
    manager.listaCursosPrint()

    println("-----------EXLUSÃO---------")
    manager.excluirCurso(2)

    println("------DEPOIS EXCLUSÃO------")
    manager.listaCursosPrint()


//    kotlin.print()
//    aluno1.print()
//    aluno2.print()
//    prof1.print()
//    prof2.print()
//    aluno1Kotlin.print()


//    println("-------testes----------")
//
//    var lista = mutableListOf("a", "b", listOf("1","4",5))
//    //val quebraLista= lista.get(2) as List<Any>
//
//    //val quebraLista2: List<Any> = listOf()
//
//    println("forEach")
//    lista.forEach{
//       // if (it is List<*>){
//           // println(lista.indexOf())
//       // }else println("desisto")
//    }
//
//
//    println("for")
//    for (item in lista){
//        if (item is List<*>){
//            println(lista.indexOf(item))
//        }else println("desisto")
//    }
//    //println(quebraLista.indexOf("1"))
}