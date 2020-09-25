package br.com.DigitalHouse.desafio1

class Aluno(var nome: String = "", var sobrenome: String, var codAluno: Int = 0) {
    fun gerarCod(){
        codAluno ++
    }

    //Um aluno será igual a outro se seus códigos de aluno forem iguais
      init {
            gerarCod()
       }

    fun print(){
        println("$nome $sobrenome Código: $codAluno")
    }
}