package br.com.alura.bytebank.modelo

class Gerente (
         nome: String,
         cpf: String,
         salario: Double,
        senha: Int,
        plr: Double

        //val tipo: Int // 0 br.com.alura.bytebank.modelo.Funcionario , 1 gerente , 2 br.com.alura.bytebank.modelo.Diretor
    )  : FuncionarioAdmin(
        nome= nome,
        cpf = cpf,
        salario= salario,
    senha = senha ,
    plr = plr){




        override val bonificacao: Double
            get() {
                return salario
            }

    }




