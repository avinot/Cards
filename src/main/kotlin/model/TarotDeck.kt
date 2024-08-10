package avinot.model

import avinot.model.Card.StandardColor
import avinot.model.Card.StandardValue

class TarotDeck : Deck() {

    override val cards: MutableList<Card> = mutableListOf<Card>().apply {
        val trump = "TRUMP"
        for (i in 1..21) {
            add(Card(i.toString(), trump))
        }
        enumValues<StandardColor>().forEach { color ->
            add(Card("RIDER", color.toString()))
            enumValues<StandardValue>().forEach { value ->
                add(Card(value.toString(), color.toString()))
            }
        }
        add(Card("JOKER", trump, "JOKER"))
    }
}