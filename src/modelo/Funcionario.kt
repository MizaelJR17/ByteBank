package modelo

abstract  class Funcionario(
        val nome: String,
        val cpf: String,
        val salario: Double

        //val tipo: Int // 0 modelo.Funcionario , 1 gerente , 2 modelo.Diretor
    ) {


        open val bonificacao: Double get() = salario * 0.1




    }