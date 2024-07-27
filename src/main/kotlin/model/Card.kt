package avinot.model

data class Card(val value: Value, val color: Color) {

    fun print() {
        println("$value of $color")
    }

}