package br.com.DigitalHouse.desafio1

open class Curso (var nome : String = "", var codCurso: Int = 0, var alunosMax: Int){
  //Um curso será igual a outro se seus códigos de curso forem iguais
    var listaAlunos: MutableList<Aluno> = mutableListOf()

    fun adicionarUmAluno(umAluno: Aluno) : Boolean{
        if (listaAlunos.size < alunosMax) {
            listaAlunos.add(umAluno)
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno){
        var index = listaAlunos.indexOf(umAluno)
        listaAlunos.removeAt(index)
    }

}


//  fun print(){
//      println("$nome Código: $codCurso")
//  }
//}