    class Diretor (
        nome: String,
        cpf: String,
        salario: Double,
         senha: Int,
        plr : Double
        //val tipo: Int // 0 Funcionario , 1 gerente , 2 Diretor
    )  : FuncionarioAdmin (
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






