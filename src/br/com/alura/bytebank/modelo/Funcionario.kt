package br.com.alura.bytebank.modelo

abstract  class Funcionario(
        val nome: String,
        val cpf: String,
        val salario: Double

        //val tipo: Int // 0 br.com.alura.bytebank.modelo.Funcionario , 1 gerente , 2 br.com.alura.bytebank.modelo.Diretor
    ) {


        open val bonificacao: Double get() = salario * 0.1




    }