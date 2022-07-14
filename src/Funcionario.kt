    abstract  class Funcionario(
        val nome: String,
        val cpf: String,
        val salario: Double

        //val tipo: Int // 0 Funcionario , 1 gerente , 2 Diretor
    ) {


        open val bonificacao: Double get() = salario * 0.1




    }