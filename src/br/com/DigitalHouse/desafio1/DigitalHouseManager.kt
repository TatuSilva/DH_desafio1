package br.com.DigitalHouse.desafio1

open class DigitalHouseManager() {
    //var listaAlunos: MutableList<Aluno> = mutableListOf()
    var listaProfessores: MutableList<Professor> = mutableListOf()
    var listaCursos: MutableList<Curso> = mutableListOf()
    var listaMatriculas: MutableList<Matricula> = mutableListOf()


    open fun registrarCurso(novoCurso: Curso): Collection<Curso> {
        var codigoCadastrado = false
        this.listaCursos.forEach{
            if(it.codCurso == novoCurso.codCurso){
                codigoCadastrado = true
            }
        }
        if(!codigoCadastrado) {
            listaCursos.add(novoCurso)
                println("O curso foi registrado com sucesso!\nCurso: ${novoCurso.nome}\nCódigo: ${novoCurso.codCurso}\nQuantidade Máxima de Alunos: ${novoCurso.alunosMax}")
            return listaCursos
        } else {
                println("Código já cadastrado. Por favor tente novamente!")
        }
        return listaCursos
        }

       open fun excluirCurso(codExcluir: Int) {
            var cursoExcluir: Curso
            this.listaCursos.forEach {
                if (it.codCurso === codExcluir) {
                    cursoExcluir = it
//                    var index = listaCursos.indexOf(cursoExcluir)
                   //println("Index: ${listaCursos.indexOf(cursoExcluir)}")
                    //listaCursos.remove(cursoExcluir)
//                   listaCursos.removeAt(index)
                    println("Curso ${cursoExcluir.nome} excluído com sucesso!")
                }
            }
        //if(cursoExcluir.codCurso == 0) println("Curso não encontrado. Tente novamente.")
            //else
        }


        open fun listaCursosPrint(){
            listaCursos.forEach{
                println("${it.codCurso} - ${it.nome}")
            }
        }
    }
