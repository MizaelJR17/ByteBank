fun testaFuncionarios() {

    val mizael = Analista(
        "Mizael",
        "704.216.804-66",
        4500.00

    )
    println("--------------------------------------------------------")

    println("nome  : ${mizael.nome}")
    println("CPF :  ${mizael.cpf}")
    println("Salario : ${mizael.salario}")
    //println("Tipo : ${mizael.tipo}")
    println("Bonificacao ${mizael.bonificacao}")

    val luciana = Gerente(
        " Gerente luciana ",
        "222.222.222-22",
        8800.00,
        2430,
        5000.00
    )

    println("--------------------------------------------------------")


    println("nome  : ${luciana.nome}")
    println("CPF :  ${luciana.cpf}")
    println("Salario : ${luciana.salario}")
    println("Bonificacao ${luciana.bonificacao}")

    println("--------------------------------------------------------")

    if (luciana.autentica(7850)) {

        println("Autenticou com sucesso")

    } else {
        println("Falha na Autenticacao")
    }


    val jeff = Diretor(
        " CEO JEFF ",
        "333.333.333-33",
        15000.00,
        777,
        200.00
    )

    val  ana = Cliente(
        " ana ",
        "333.333.333-33",
        15

    )






    println("--------------------------------------------------------")



    println("nome  : ${jeff.nome}")
    println("CPF :  ${jeff.cpf}")
    println("Salario : ${jeff.salario}")
    println("Bonificacao ${jeff.bonificacao}")

    println("--------------------------------------------------------")

    val maria = Analista(
        "Maria",
        "444.444.444-44",
        6500.0

    )

    println("--------------------------------------------------------")

    if (jeff.autentica(777)) {

        println("Autenticou com sucesso")

    } else {
        println("Falha na Autenticacao")


    }
    println("--------------------------------------------------------")


    val calculadora = CalculadoraBonificacao()

    calculadora.registra(luciana)
    calculadora.registra(jeff)



    println("Total de Bonificação: ${calculadora.total}")
}









