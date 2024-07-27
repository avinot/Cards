package avinot

import avinot.model.Card
import avinot.model.Color
import avinot.model.Value

fun main() {
    val card = Card(Value.ACE, Color.DIAMOND)
    card.print()
}