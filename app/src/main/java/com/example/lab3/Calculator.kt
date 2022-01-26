package com.example.lab3

class Calculator {

    companion object {
        var number1: Int? = null
        var number2: Int? = null
        var math_operation: String = ""

        fun calculate(): Int? {
            var res: Int? = null
            if (number1 != null && number2 != null) {
                when (math_operation) {
                    "+" -> res = number1!! + number2!!
                    "-" -> res = number1!! - number2!!
                    "*" -> res = number1!! * number2!!
                    "/" -> res = number1!! / number2!!
                }
            }
            return res
        }

    }
}