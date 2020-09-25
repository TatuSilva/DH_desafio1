package br.com.DigitalHouse.desafio1

import java.util.*

open class Matricula (var aluno: Aluno, var curso: Curso, var data: Date = Date()){

    fun print(){
        println("${aluno.nome} foi matriculado no curso ${curso.nome} no dia $data")
    }
}