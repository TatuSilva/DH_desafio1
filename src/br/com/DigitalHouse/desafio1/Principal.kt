package br.com.DigitalHouse.desafio1

class Principal {
}
fun main() {
    val manager = DigitalHouseManager()
    val aluno1 = Aluno("Tainá", "Moraes")
    val aluno2 = Aluno("Amanda", "Silva")

    val kotlin = Curso("Kotlin", 1, 3)
    val android = Curso("Android", 2, 5)

    val prof1 = ProfessorAdjunto("Bruna", "Lemos", 4, 1,6)
    val prof2 = ProfessorTitular("Paula", "Souza", 2, 2, "Geografia")

    val aluno1Kotlin = Matricula(aluno1, kotlin)

    manager.registrarCurso(kotlin)
    manager.registrarCurso(android)

    println("ANTES EXCLUSÃO\n-----------")
    manager.listaCursosPrint()

    manager.excluirCurso(1)

    println("DEPOIS EXCLUSÃO\n" +
            "-----------")
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