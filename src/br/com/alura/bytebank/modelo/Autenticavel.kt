package br.com.alura.bytebank.modelo

interface Autenticavel {

        val senha : Int

    fun autentica(senha : Int) : Boolean



    }