package br.com.DigitalHouse.desafio1

class ProfessorTitular(override var nome: String = "", override var sobrenome: String = "", override var tempo: Int = 0, override var codProfessor: Int = 0, var especialidade: String = "")
    : Professor() {

    fun print(){
        println("Professor Titular $nome $sobrenome especialista em $especialidade tem $tempo anos de casa. \nCódigo: $codProfessor")
    }
}