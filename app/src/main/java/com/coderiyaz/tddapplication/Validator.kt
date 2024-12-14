package com.coderiyaz.tddapplication

object Validator {

    fun validateInput(amount: Int, description: String) : Boolean {
        return (amount > 0 && description.isNotEmpty())
    }
}