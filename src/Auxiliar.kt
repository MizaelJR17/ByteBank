   open class Auxiliar (
         nome: String,
         cpf: String,
         salario: Double,
         senha: Double
        //val tipo: Int // 0 Funcionario , 1 gerente , 2 Diretor
    )  : Funcionario (
        nome= nome,
        cpf = cpf,
        salario= salario
          ){


        override val bonificacao: Double get() =   salario * 0.1





    }