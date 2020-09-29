package br.com.DigitalHouse.desafio1

import java.time.Year
import java.util.*

class Principal {
}
fun main() {

    val manager = DigitalHouseManager()

    val titular1 = ProfessorTitular("Amanda", "Silva", 2, 10001,"Hardware")
    val titular2 = ProfessorTitular("Paula","Carvalho", 4, 10002, "Kotlin")
    val adjunto1 = ProfessorAdjunto("Alfredo", "Souza", 1, 10003, 3)
    val adjunto2 = ProfessorAdjunto("Cristina", "Alvarez", 3, 10004, 5)

    val fullStack = Curso("Full Stack", 20001, 3)
    val android = Curso("Android", 20002, 2)

    val aluno1 = Aluno("José", "Ribeiro", 30001)
    val aluno2 = Aluno("Maria", "Ferreira", 30002)
    val aluno3 = Aluno("Alvaro", "Costa", 30003)
    val aluno4 = Aluno("Evelyn", "Souza", 30004)
    val aluno5 = Aluno("Fernanda", "Almeida", 30005)

    manager.registrarProfessorAdjunto(adjunto1)
    manager.registrarProfessorAdjunto(adjunto2)
    manager.registrarProfessorTitular(titular1)
    manager.registrarProfessorTitular(titular2)
    manager.registrarCurso(fullStack)
    manager.registrarCurso(android)
    manager.alocarProfessores(20001, 10001, 10003)
    manager.alocarProfessores(20002, 10002, 10004)
    manager.matricularAluno(aluno1)
    manager.matricularAluno(aluno2)
    manager.matricularAluno(aluno3)
    manager.matricularAluno(aluno4)
    manager.matricularAluno(aluno5)
    manager.matricularAlunoCurso(30001,20001)
    manager.matricularAlunoCurso(30002,20001)
    manager.matricularAlunoCurso(30003,20002)
    manager.matricularAlunoCurso(30004,20002)
    manager.matricularAlunoCurso(30005,20002)

    //MENU
    var menu = ""
    while (menu != "sair") {
        println("BEM VINDO(A) AO SISTEMA DIGITAL HOUSE\n" +
                "O QUE VOCÊ GOSTARIA DE FAZER HOJE?\n"+
                "====================================\n" +
                " 1 -> ADICIONAR UM NOVO CURSO\n" +
                " 2 -> EXCLUIR UM CURSO\n" +
                " 3 -> LISTAR CURSOS CADASTRADOS\n" +
                " 4 -> ADICIONAR UM NOVO PROFESSOR\n" +
                " 5 -> ALOCAR PROFESSOR EM UM CURSO\n" +
                " 6 -> EXCLUIR UM PROFESSOR\n" +
                " 7 -> LISTAR PROFESSORES CADASTRADOS\n" +
                " 8 -> ADICIONAR UM NOVO ALUNO\n" +
                " 9 -> MATRICULAR UM ALUNO EM UM CURSO\n" +
                "10 -> EXCLUIR UM ALUNO\n" +
                "11 -> LISTAR ALUNOS CADASTRADOS\n" +
                "12 -> CONSULTAR CURSO EM QUE ALUNO ESTÁ MATRICULADO\n"+
                "sair -> SAIR\n" +
                "====================================\n" +
                "DIGITE UMA OPÇÃO E APERTE ENTER:\n")

        menu = readLine()!!.toString()

        when (menu) {
            "1" -> {
                try{
                    println("NOME DO CURSO:")
                    var inputNomeCurso = readLine()!!.toString()
                    println("CÓDIGO DO CURSO:")
                    var inputCodigoCurso = readLine()!!.toInt()
                    println("QUANTIDADE MÁXIMA DE ALUNOS:")
                    var inputQntAlunos = readLine()!!.toInt()
                    var novoCurso = Curso(inputNomeCurso, inputCodigoCurso, inputQntAlunos)
                    manager.registrarCurso(novoCurso)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "2" -> {
                try{
                    println("CÓDIGO DO CURSO  A SER EXCLUÍDO:")
                    var inputExcluirCurso = readLine()!!.toInt()
                    manager.excluirCurso(inputExcluirCurso)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "3" -> {
                try{
                   manager.listaCursosPrint()
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "4" -> {
                try {
                    println("PARA PROFESSOR ADJUNTO DIGITE 1 E PARA PROFESSOR TITULAR DIGITE 2")
                    var tipoProf = readLine()!!.toInt()
                    when (tipoProf) {
                    1 -> //ADJUNTO
                    {println("NOME DO PROFESSOR:")
                    var inputNomeProf = readLine()!!.toString()
                    println("SOBRENOME DO PROFESSOR:")
                    var inputSobrenomeProf = readLine()!!.toString()
                    println("ANO DE INGRESSO NA DIGITAL HOUSE (YYYY)")
                        if(readLine()!!.toInt() > Year.now().getValue() || readLine()!!.toInt() <= 1900) println("O ano foi digitado errado. Tente novamente")
                    var tempoCasa= Year.now().getValue()-readLine()!!.toInt()
                    println("CÓDIGO DO PROFESSOR:")
                    var inputCodigoProf = readLine()!!.toInt()
                    println("HORAS DE MONITORIA:")
                    var inputHoras = readLine()!!.toInt()
                    var novoProfessorAdjunto = ProfessorAdjunto(inputNomeProf, inputSobrenomeProf, tempoCasa, inputCodigoProf, inputHoras)
                    manager.registrarProfessorAdjunto(novoProfessorAdjunto)}
                    2 ->       //TITULAR
                    {println("NOME DO PROFESSOR:")
                    var inputNomeProf = readLine()!!.toString()
                    println("SOBRENOME DO PROFESSOR:")
                    var inputSobrenomeProf = readLine()!!.toString()
                    println("ANO DE INGRESSO NA DIGITAL HOUSE (YYYY)")
                        if(readLine()!!.toInt() > Year.now().getValue() || readLine()!!.toInt() <= 1900) println("O ano foi digitado errado. Tente novamente")
                        var tempoCasa= Year.now().getValue()-readLine()!!.toInt()
                    println("CÓDIGO DO PROFESSOR:")
                    var inputCodigoProf = readLine()!!.toInt()
                    println("ESPECIALIDADE:")
                    var inputEspecialidade = readLine()!!.toString()
                    var novoProfessorTitular = ProfessorTitular(inputNomeProf, inputSobrenomeProf, tempoCasa, inputCodigoProf, inputEspecialidade)
                    manager.registrarProfessorTitular(novoProfessorTitular)}
                }
                    } catch (ex: Exception){
                        println("Algo deu errado :(\n Tente novamente.")
                    }
                }
            "5" -> {
                try{
                    println("CÓDIGO DO CURSO:")
                    var inputCodCurso = readLine()!!.toInt()
                    println("CÓDIGO DO PROFESSOR ADJUNTO:")
                    var inputCodAdjunto = readLine()!!.toInt()
                    println("CÓDIGO DO PROFESSOR TITULAR:")
                    var inputCodTitular = readLine()!!.toInt()
                    manager.alocarProfessores(inputCodCurso, inputCodTitular, inputCodAdjunto)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "6" -> {
                try{
                    println("NOME DO CURSO:")
                    var inputNomeCurso = readLine()!!.toString()
                    println("CÓDIGO DO CURSO:")
                    var inputCodigoCurso = readLine()!!.toInt()
                    println("QUANTIDADE MÁXIMA DE ALUNOS:")
                    var inputQntAlunos = readLine()!!.toInt()
                    var novoCurso = Curso(inputNomeCurso, inputCodigoCurso, inputQntAlunos)
                    manager.registrarCurso(novoCurso)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "7" -> {
                try{
                    println("NOME DO CURSO:")
                    var inputNomeCurso = readLine()!!.toString()
                    println("CÓDIGO DO CURSO:")
                    var inputCodigoCurso = readLine()!!.toInt()
                    println("QUANTIDADE MÁXIMA DE ALUNOS:")
                    var inputQntAlunos = readLine()!!.toInt()
                    var novoCurso = Curso(inputNomeCurso, inputCodigoCurso, inputQntAlunos)
                    manager.registrarCurso(novoCurso)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "8" -> {
                try{
                    println("NOME DO CURSO:")
                    var inputNomeCurso = readLine()!!.toString()
                    println("CÓDIGO DO CURSO:")
                    var inputCodigoCurso = readLine()!!.toInt()
                    println("QUANTIDADE MÁXIMA DE ALUNOS:")
                    var inputQntAlunos = readLine()!!.toInt()
                    var novoCurso = Curso(inputNomeCurso, inputCodigoCurso, inputQntAlunos)
                    manager.registrarCurso(novoCurso)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "9" -> {
                try{
                    println("NOME DO CURSO:")
                    var inputNomeCurso = readLine()!!.toString()
                    println("CÓDIGO DO CURSO:")
                    var inputCodigoCurso = readLine()!!.toInt()
                    println("QUANTIDADE MÁXIMA DE ALUNOS:")
                    var inputQntAlunos = readLine()!!.toInt()
                    var novoCurso = Curso(inputNomeCurso, inputCodigoCurso, inputQntAlunos)
                    manager.registrarCurso(novoCurso)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "10" -> {
                try{
                    println("NOME DO CURSO:")
                    var inputNomeCurso = readLine()!!.toString()
                    println("CÓDIGO DO CURSO:")
                    var inputCodigoCurso = readLine()!!.toInt()
                    println("QUANTIDADE MÁXIMA DE ALUNOS:")
                    var inputQntAlunos = readLine()!!.toInt()
                    var novoCurso = Curso(inputNomeCurso, inputCodigoCurso, inputQntAlunos)
                    manager.registrarCurso(novoCurso)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "11" -> {
                try{
                    println("NOME DO CURSO:")
                    var inputNomeCurso = readLine()!!.toString()
                    println("CÓDIGO DO CURSO:")
                    var inputCodigoCurso = readLine()!!.toInt()
                    println("QUANTIDADE MÁXIMA DE ALUNOS:")
                    var inputQntAlunos = readLine()!!.toInt()
                    var novoCurso = Curso(inputNomeCurso, inputCodigoCurso, inputQntAlunos)
                    manager.registrarCurso(novoCurso)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
            "12" -> {
                try{
                    println("CÓDIGO ALUNO:")
                    var codAlunoConsulta = readLine()!!.toInt()
                    manager.consultarCursoAluno(codAlunoConsulta)
                }catch (ex: Exception){
                    println("Algo deu errado :(\n Tente novamente.")
            }
            }
        }

    }
}

