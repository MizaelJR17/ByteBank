package br.com.alura.bytebank.modelo

class ContaSalario(override var saldo : Double) : FunContaSalario {


   override fun deposita(valor : Double) {
     if (valor > 0) {
       this.saldo += valor
     }
   }

   override fun saca(valor : Double) {
     val valorComTaxa = valor + 0.1
     if (this.saldo >= valorComTaxa) {
       this.saldo -= valorComTaxa
     }


   }
 }