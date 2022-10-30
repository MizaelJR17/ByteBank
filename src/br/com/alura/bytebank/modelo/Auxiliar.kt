package br.com.alura.bytebank.modelo

open class Auxiliar (
         nome: String,
         cpf: String,
         salario: Double,
         senha: Double
        //val tipo: Int // 0 br.com.alura.bytebank.modelo.Funcionario , 1 gerente , 2 br.com.alura.bytebank.modelo.Diretor
    )  : Funcionario(
        nome= nome,
        cpf = cpf,
        salario= salario
          ){


        override val bonificacao: Double get() =   salario * 0.1





    }