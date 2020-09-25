package br.com.DigitalHouse.desafio1

class DigitalHouseManager() {
    var listaAlunos: MutableList<Aluno> = mutableListOf()
    var listaProfessores: MutableList<Professor> = mutableListOf()
    var listaCursos: MutableList<Curso> = mutableListOf()
    var listaMatriculas: MutableList<Matricula> = mutableListOf()


    fun registrarCurso(novoCurso: Curso): Collection<Curso> {
        var codigoCadastrado = false
        this.listaCursos.forEach{
            if(it.codCurso == novoCurso.codCurso){
                codigoCadastrado = true
            }
        }

        if(!codigoCadastrado) {
            listaCursos.add(novoCurso)
            listaCursos.forEach {
                println("O curso foi registrado com sucesso!\nCurso: ${it.nome}\nCódigo: ${it.codCurso}\nQuantidade Máxima de Alunos: ${it.alunosMax}")
                println("-----------------------")
            }
        } else {
                println("Código já cadastrado. Por favor tente novamente!")
                println("-----------------------")
        }
            return listaCursos
        }
    }
