package br.com.DigitalHouse.desafio1

open class Curso (var nome : String = "", var codCurso: Int = 0, var alunosMax: Int){
  //Um curso será igual a outro se seus códigos de curso forem iguais
    open val listaAlunosNoCurso: MutableList<Aluno> = mutableListOf()
    open val professoresNoCurso: MutableList<Professor> = mutableListOf(ProfessorAdjunto(), ProfessorTitular())

    open fun adicionarUmAluno(umAluno: Aluno) : Boolean{
        if (listaAlunosNoCurso.size < alunosMax) {
            listaAlunosNoCurso.add(umAluno)
            return true
        }
        return false
    }

    open fun excluirAluno(umAluno: Aluno){
        var index = listaAlunosNoCurso.indexOf(umAluno)
        listaAlunosNoCurso.removeAt(index)
    }

    open fun adicionarProfessores(titular: ProfessorTitular, adjunto: ProfessorAdjunto): Boolean{
        professoresNoCurso.add(titular)
        professoresNoCurso.add(adjunto)
        return true
    }
}
