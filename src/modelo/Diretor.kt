package modelo

import modelo.FuncionarioAdmin

class Diretor (
        nome: String,
        cpf: String,
        salario: Double,
         senha: Int,
        plr : Double
        //val tipo: Int // 0 modelo.Funcionario , 1 gerente , 2 modelo.Diretor
    )  : FuncionarioAdmin(
        nome= nome,
        cpf = cpf,
        salario= salario ,
    senha = senha ,
    plr = plr
    ) {

        override val bonificacao: Double

            get() {
                return salario
            }



}






