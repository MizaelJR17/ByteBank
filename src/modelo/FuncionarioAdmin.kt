package modelo

abstract  class FuncionarioAdmin(
         nome: String,
         cpf: String,
         salario: Double ,
       protected val senha : Int,
        val plr : Double
        //val tipo: Int // 0 modelo.Funcionario , 1 gerente , 2 modelo.Diretor
    ): Funcionario(
        nome,
        cpf,
        salario
    ) {

      open fun autentica(senha : Int) : Boolean {
            if (this.senha == senha) {
                return true
            } else {
                return false
            }

        }


    }

