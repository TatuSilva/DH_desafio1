package br.com.DigitalHouse.desafio1

open class Curso (var nome : String = "", var codCurso: Int = 0){
  //Um curso será igual a outro se seus códigos de curso forem iguais
  fun print(){
      println("$nome Código: $codCurso")
  }
}