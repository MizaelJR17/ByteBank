package br.com.alura.bytebank.modelo

interface FunContaSalario {

    var saldo : Double


    fun deposita(valor: Double)

    fun saca(valor: Double)
}