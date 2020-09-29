package br.com.DigitalHouse.desafio1

open class DigitalHouseManager() {

    var listaAlunos: MutableList<Aluno> = mutableListOf()
    var listaProfessores: MutableList<Professor> = mutableListOf()
    var listaCurso: MutableList<Curso> = mutableListOf()
    var listaMatriculas: MutableList<Matricula> = mutableListOf()

//CURSOS
    open fun registrarCurso(novoCurso: Curso): Collection<Curso> {
        var codigoCadastrado = false
        this.listaCurso.forEach{
            if(it.codCurso == novoCurso.codCurso){
                codigoCadastrado = true
            }
        }
        if(!codigoCadastrado) {
            listaCurso.add(novoCurso)
                println("O curso foi registrado com sucesso!\nCurso: ${novoCurso.nome}\nCódigo: ${novoCurso.codCurso}\nQuantidade Máxima de Alunos: ${novoCurso.alunosMax}\n" +
                        "================================")
            return listaCurso
        } else {
                println("Código já cadastrado. Por favor tente novamente!\n================================")
        }
        return listaCurso
        }
//EXCLUIR CURSO

       open fun excluirCurso(codExcluir: Int): MutableList<Curso> {
           var cursoExcluir: Curso = Curso("Erro", 0,0)
           try {
               this.listaCurso.forEach {
                   if (it.codCurso == codExcluir.toInt()) {
                       cursoExcluir = it
                       var index = listaCurso.indexOf(cursoExcluir)
                       listaCurso.removeAt(index)
                       println("Curso ${cursoExcluir.nome} excluído com sucesso!\n" +
                               "================================")
                   }
               }
               if(cursoExcluir.nome == "Erro")  println("Curso não encontrado. Tente novamente.\n" +
                       "================================")
           }catch (ex: Exception){
              // ENTENDER PQ ESTÁ CAINDO EM CATCH NO PRIMEIRO E ÚLTIMO INDEX
           }
       return listaCurso
       }

//IMPRIME LISTA CURSOS
        open fun listaCursosPrint(){
           return listaCurso.forEach{
                println("${it.codCurso} - ${it.nome}\n" +
                        "======================")
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
            println("O Professor(a) Adjunto/a foi registrado com sucesso!\nNome Completo: ${novoProf.nome} ${novoProf.sobrenome}\nCódigo: ${novoProf.codProfessor}\nHoras de monitoria: ${novoProf.horasMonitoria}\n" +
                    "================================")
            return listaProfessores
        } else {
            println("Professor já cadastrado. Por favor tente novamente!\n" +
                    "================================")
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
                println("O Professor(a) Titular foi registrado com sucesso!\nNome Completo: ${novoProf.nome} ${novoProf.sobrenome}\nCódigo: ${novoProf.codProfessor}\nEspecialidade: ${novoProf.especialidade}\n" +
                        "================================")
                return listaProfessores
            } else {
                println("Código de professor já cadastrado. Por favor tente novamente!\n" +
                        "================================")
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
                    println("Professor(a) ${profExcluir.nome} ${profExcluir.sobrenome} excluído com sucesso!\n" +
                            "================================")
                    naoEncontrado = 1
                }else{
                    naoEncontrado = 0
                }
            }
            if(naoEncontrado == 0)  println("Professor não encontrado. Tente novamente.\n" +
                    "================================")
        }catch (ex: Exception){
            // ENTENDER PQ ESTÁ CAINDO EM CATCH NO PRIMEIRO E ÚLTIMO INDEX
        }
        return listaProfessores
    }
//IMPRIME LISTA PROFESSOR
    open fun listaProfPrint(){
        listaProfessores.forEach{
            println("${it.codProfessor} - ${it.nome} ${it.sobrenome}\n" +
                    "======================")
        }
    }

//MATRICULAR ALUNO
    fun matricularAluno (novoAluno: Aluno): Collection<Aluno>{
    var codigoCadastrado = false
    this.listaAlunos.forEach{
        if(it.codAluno == novoAluno.codAluno){
            codigoCadastrado = true
        }
    }
    if(!codigoCadastrado) {
        listaAlunos.add(novoAluno)
        println("Aluno(a) foi registrado com sucesso!\nNome Completo: ${novoAluno.nome} ${novoAluno.sobrenome}\nCódigo: ${novoAluno.codAluno}\n" +
                "================================")
        return listaAlunos
    } else {
        println("Código de aluno já cadastrado. Por favor tente novamente!\n" +
                "================================")
    }
    return listaAlunos
    }

    //EXCLUIR ALUNO

    open fun excluirAluno(codExcluir: Int): MutableList<Aluno> {
        var alunoExcluir: Aluno
        var naoEncontrado: Int = 0
        try {
            this.listaAlunos.forEach {
                if (it.codAluno == codExcluir.toInt()) {
                    alunoExcluir = it
                    var index = listaAlunos.indexOf(alunoExcluir)
                    listaAlunos.removeAt(index)
                    println("Aluno(a) ${alunoExcluir.nome} ${alunoExcluir.sobrenome} excluído com sucesso!\n" +
                            "================================")
                    naoEncontrado = 1
                }else{
                    naoEncontrado = 0
                }
            }
            if(naoEncontrado == 0)  println("Aluno(a) não encontrado. Tente novamente.\n" +
                    "================================")
        }catch (ex: Exception){
            // ENTENDER PQ ESTÁ CAINDO EM CATCH NO PRIMEIRO E ÚLTIMO INDEX
        }
        return listaAlunos
    }
    //IMPRIME LISTA ALUNO
    open fun listaAlunoPrint(){
        listaAlunos.forEach{
            println("${it.codAluno} - ${it.nome} ${it.sobrenome}\n" +
                    "======================")
        }
    }

    //MATRICULAR ALUNO NO CURSO
    fun matricularAlunoCurso(codigoAluno: Int, codigoCurso: Int): MutableList<Matricula> {

        var procuraCurso: Curso = Curso("", 0, 0)
        var procuraAluno: Aluno = Aluno("", "", 0)
        listaCurso.forEach{
            if(codigoCurso.toInt() == it.codCurso) {
                procuraCurso = it
            }
        }
        listaAlunos.forEach{
            if(codigoAluno.toInt() == it.codAluno) {
                procuraAluno = it
            }
        }

        if(procuraAluno.codAluno == 0)
        {
            println("Aluno não encontrado\n" +
                    "================================")
            return listaMatriculas
        }
        if(procuraCurso.codCurso == 0) {
            println("Curso não encontrado\n" +
                    "================================")
            return listaMatriculas
        }
        if(procuraCurso.alunosMax > procuraCurso.listaAlunosNoCurso.size) {
            procuraCurso.adicionarUmAluno(procuraAluno)
            listaMatriculas.add(Matricula(procuraAluno,procuraCurso))
            println("Matrícula realizada com sucesso!\n${procuraAluno.nome} foi matriculado(a) no curso ${procuraCurso.nome}\n" +
                    "================================")
        }else {
            println("Não foi possível realizar a matrícula.\nNão há mais vagas disponíveis para este curso.\n" +
                    "================================")
        }
        return listaMatriculas
        }

//ADICIONAR PROFESSORES A UM CURSO

        fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int): MutableList<Professor> {
            try{
            var procuraProfTitular: ProfessorTitular = ProfessorTitular("", "",0,0, "")
            var procuraProfAdjunto: ProfessorAdjunto = ProfessorAdjunto("", "",0,0, 0)
            var procuraCurso: Curso = Curso("", 0, 0)

            listaCurso.forEach{
                if(codigoCurso.toInt() == it.codCurso) {
                    procuraCurso = it
                }
            }
            listaProfessores.forEach{
                if(codigoProfessorAdjunto.toInt() == it.codProfessor) {
                    procuraProfAdjunto = it as ProfessorAdjunto
                }
            }
            listaProfessores.forEach{
                if(codigoProfessorTitular.toInt() == it.codProfessor) {
                    procuraProfTitular = it as ProfessorTitular
                }
            }

                if(procuraProfTitular.codProfessor != 0 && procuraProfAdjunto.codProfessor != 0 && procuraCurso.codCurso != 0){
                    procuraCurso.adicionarProfessores(procuraProfTitular, procuraProfAdjunto)
                    println("Professores alocados com sucesso!" +
                            "\nCurso: ${procuraCurso.nome}" +
                            "\nProfessor(a) Titular: ${procuraProfTitular.nome} ${procuraProfTitular.sobrenome}" +
                            "\nProfessor(a) Adjunto(a): ${procuraProfAdjunto.nome} ${procuraProfAdjunto.sobrenome}\n" +
                            "================================")
                    return listaProfessores
                }

            if(procuraCurso.codCurso == 0) {
                println("Curso não encontrado\n" +
                        "================================")
                return listaProfessores
            }
            if(procuraProfTitular.codProfessor == 0 )
            {
                println("Professor(a) titular não encontrado(a)\n" +
                        "================================")
                return listaProfessores
            }
            if(procuraProfAdjunto.codProfessor == 0)
            {
                println("Professor(a) adjunto não encontrado(a)\n" +
                        "================================")
                return listaProfessores
            }
            }catch (ex: Exception){
                println("Algo deu errado. Verifique os códigos digitados.\n" +
                        "================================")
            }
            return listaProfessores
        }
        fun consultarCursoAluno(codigoAluno: Int){
            var procuraAlunoCurso = Aluno("","", 0)
            listaMatriculas.forEach {
                if(codigoAluno.toInt() == it.aluno.codAluno){
                    procuraAlunoCurso = it.aluno
                    println("Aluno(a) ${it.aluno.nome} está matriculado no curso ${it.curso.nome}")
                }
            }
            if(procuraAlunoCurso.codAluno == 0) println("Aluno não encontrado ou aluno não está matriculado em nenhum curso")
        }
        }


