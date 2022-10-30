package modelo

class Analista (
         nome: String,
         cpf: String,
         salario: Double

        //val tipo: Int // 0 modelo.Funcionario , 1 gerente , 2 modelo.Diretor
    )  : Funcionario(
        nome= nome,
        cpf = cpf,
        salario= salario
            ) {


        override val bonificacao : Double get() =   salario



    }
