fun testasContasDiferentes() {

    val contaCorrente = ContaCorrente(
        "Mizael",
        85555624
    )

    val contaPoupanca = ContaPoupanca(
        "Luciana",
        578955465
    )


    println("--------------------------INICIANDO OPERACOES DE BANCO------------------------------")

    println("---------------------#TITULAR--${contaCorrente.titular}------------------------")

    contaCorrente.deposita(4000.00)
    println ("---------------------------Saldo corrente: ${contaCorrente.saldo}------------------")

    println("----------------------------Operacao Feita-------------------------------------------")

    println(" ")

    println("---------------------------INICIANDO OPERACOES DE BANCO------------------------------")

    println("---------------------#TITULAR--${contaPoupanca.titular}------------------------")
    contaPoupanca.deposita(500.00)


    println ("-------------------------Saldo poupanca: ${contaPoupanca.saldo}----------------------")


    println("")
    println("---------------------------INICIANDO OPERACOES DE BANCO------------------------------")
    println("----------------Saque do titular ${contaCorrente.titular} Realizado com sucesso----------------")



    println("--------------------------- SAQUE DO TITULAR ${contaCorrente.titular} ------------------------------")


    println("-------------------------------- Saldo Restante: ${contaCorrente.saldo} ----------------------------------------------------")

    println("")
    println("--------------------------- SAQUE DO TITULAR ${contaCorrente.titular} ------------------------------")

    contaCorrente.saca(200.00)

    println("-------------------------------- Saldo Restante: ${contaCorrente.saldo} ----------------------------------------------------")


    println("")


    println("--------------------------- SAQUE DO TITULAR ${contaPoupanca.titular} ------------------------------")

    contaPoupanca.saca(200.00)

    println("-------------------------------- Saldo Restante: ${contaPoupanca.saldo} ----------------------------------------------------")

    println("")


    println("--------------------------- TRANSFERENCIA DO TITULAR ${contaCorrente.titular} ------------------------------")

    contaCorrente.transfere(500.00,contaPoupanca)

    println("---------------------------- Saldo da Conta Corrente apos transferencia ${contaCorrente.saldo} -----------------")


    println("")

    println("--------------------------- TRANSFERENCIA DO TITULAR ${contaPoupanca.titular} ------------------------------")

    contaPoupanca.transfere(500.00,contaCorrente)

    println("---------------------------- Saldo da Conta Corrente apos transferencia ${contaPoupanca.saldo} -----------------")





}