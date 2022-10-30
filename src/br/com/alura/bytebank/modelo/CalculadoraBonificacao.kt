package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {


    var total : Double = 0.0
    private set

    fun  registra (funcionario : Diretor) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao


    }

    fun registra(funcionario : Gerente) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }
}