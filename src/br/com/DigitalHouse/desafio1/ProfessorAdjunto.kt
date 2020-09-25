package br.com.DigitalHouse.desafio1

class ProfessorAdjunto(override var nome: String = "", override var sobrenome: String = "", override var tempo: Int = 0, override var codProfessor: Int = 0, var horasMonitoria: Int =0): Professor() {

    fun print(){
        println("Professor Adjunto $nome $sobrenome tem $tempo anos de casa. \nCódigo: $codProfessor Horas de Monitoria: $horasMonitoria")
    }
}