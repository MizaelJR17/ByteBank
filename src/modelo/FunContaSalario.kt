package modelo

interface FunContaSalario {

    var saldo : Double


    fun deposita(valor: Double)

    fun saca(valor: Double)
}