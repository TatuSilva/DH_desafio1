package br.com.digitalHouse.desafio1

class ProfessorTitular(override var nome: String = "", override var sobrenome: String = "", override var tempo: Int = 0, override var codProfessor: Int = 0, var especialidade: String = "")
    : Professor()