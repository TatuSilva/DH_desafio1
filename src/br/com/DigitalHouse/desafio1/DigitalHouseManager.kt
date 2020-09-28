package br.com.DigitalHouse.desafio1

open class DigitalHouseManager() {
    //var listaAlunos: MutableList<Aluno> = mutableListOf()
    var listaProfessores: MutableList<Professor> = mutableListOf()
    var listaProfessor: MutableList<Curso> = mutableListOf()
    var listaMatriculas: MutableList<Matricula> = mutableListOf()

//CURSOS
    open fun registrarCurso(novoCurso: Curso): Collection<Curso> {
        var codigoCadastrado = false
        this.listaProfessor.forEach{
            if(it.codCurso == novoCurso.codCurso){
                codigoCadastrado = true
            }
        }
        if(!codigoCadastrado) {
            listaProfessor.add(novoCurso)
                println("O curso foi registrado com sucesso!\nCurso: ${novoCurso.nome}\nCódigo: ${novoCurso.codCurso}\nQuantidade Máxima de Alunos: ${novoCurso.alunosMax}")
            return listaProfessor
        } else {
                println("Código já cadastrado. Por favor tente novamente!")
        }
        return listaProfessor
        }
//EXCLUIR CURSO

       open fun excluirCurso(codExcluir: Int): MutableList<Curso> {
           var cursoExcluir: Curso = Curso("Erro", 0,0)
           try {
               this.listaProfessor.forEach {
                   if (it.codCurso == codExcluir.toInt()) {
                       cursoExcluir = it
                       var index = listaProfessor.indexOf(cursoExcluir)
                       listaProfessor.removeAt(index)
                       println("Curso ${cursoExcluir.nome} excluído com sucesso!")
                   }//else cursoExcluir = Curso("Erro", 0,0)
               }
               if(cursoExcluir.nome == "Erro")  println("Curso não encontrado. Tente novamente.")
           }catch (ex: Exception){
              // ENTENDER PQ ESTÁ CAINDO EM CATCH NO PRIMEIRO E ÚLTIMO INDEX
           }
       return listaProfessor
       }
//IMPRIME LISTA CURSOS
        open fun listaCursosPrint(){
            listaProfessor.forEach{
                println("${it.codCurso} - ${it.nome}")
            }
        }

//PROFESSOR ADJUNTO

    open fun registrarProfessorAdjunto(novoProf: ProfessorAdjunto): Collection<Professor> {
        var codigoCadastrado = false
        this.listaProfessores.forEach{
            if(it.codProfessor == novoProf.codProfessor){
                codigoCadastrado = true
            }
        }
        if(!codigoCadastrado) {
            listaProfessores.add(novoProf)
            println("O Professor(a) Adjunto/a foi registrado com sucesso!\nNome Completo: ${novoProf.nome}${novoProf.sobrenome}\nCódigo: ${novoProf.codProfessor}\nHoras de monitoria: ${novoProf.horasMonitoria}")
            return listaProfessores
        } else {
            println("Professor já cadastrado. Por favor tente novamente!")
        }
        return listaProfessores
    }
//PROFESSOR TITULAR
        open fun registrarProfessorTitular(novoProf: ProfessorTitular): Collection<Professor> {
            var codigoCadastrado = false
            this.listaProfessores.forEach{
                if(it.codProfessor == novoProf.codProfessor){
                    codigoCadastrado = true
                }
            }
            if(!codigoCadastrado) {
                listaProfessores.add(novoProf)
                println("O Professor(a) Titular foi registrado com sucesso!\nNome Completo: ${novoProf.nome} ${novoProf.sobrenome}\nCódigo: ${novoProf.codProfessor}\nEspecialidade: ${novoProf.especialidade}")
                return listaProfessores
            } else {
                println("Código de professor já cadastrado. Por favor tente novamente!")
            }
            return listaProfessores
        }
//EXCLUIR PROFESSOR

    open fun excluirProfessor(codExcluir: Int): MutableList<Professor> {
        var profExcluir: Professor
        var naoEncontrado: Int = 0
        try {
            this.listaProfessores.forEach {
                if (it.codProfessor == codExcluir.toInt()) {
                    profExcluir = it
                    var index = listaProfessores.indexOf(profExcluir)
                    listaProfessores.removeAt(index)
                    println("Professor(a) ${profExcluir.nome} ${profExcluir.sobrenome} excluído com sucesso!")
                    naoEncontrado = 1
                }else{
                   // profExcluir = ProfessorTitular("Erro", "Erro", 0 ,0, "Erro")
                    naoEncontrado = 0
                }
            }
            if(naoEncontrado == 0)  println("Professor não encontrado. Tente novamente.")
        }catch (ex: Exception){
            // ENTENDER PQ ESTÁ CAINDO EM CATCH NO PRIMEIRO E ÚLTIMO INDEX
        }
        return listaProfessores
    }
//IMPRIME LISTA PROFESSOR
    open fun listaProfPrint(){
        listaProfessores.forEach{
            println("${it.codProfessor} - ${it.nome} ${it.sobrenome}")
        }
    }

}
