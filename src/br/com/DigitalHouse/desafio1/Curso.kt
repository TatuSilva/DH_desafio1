package br.com.DigitalHouse.desafio1

open class Curso (var nome : String = "", var codCurso: Int = 0, var alunosMax: Int){
  //Um curso será igual a outro se seus códigos de curso forem iguais

//    fun adicionarUmAluno(umAluno: Aluno): Boolean{
//        cursos = umAluno
//    }


  fun print(){
      println("$nome Código: $codCurso")
  }
}