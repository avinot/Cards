package avinot.model

import avinot.model.Card.StandardColor
import avinot.model.Card.StandardValue

class PokerDeck : Deck() {

    override val cards: MutableList<Card> = mutableListOf<Card>().apply {
        enumValues<StandardColor>().forEach { color ->
            enumValues<StandardValue>().forEach { value ->
                add(Card(value.toString(), color.toString()))
            }
        }
    }


}