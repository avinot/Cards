package avinot.model

abstract class Deck {
    abstract val cards: MutableList<Card>

    fun shuffle() {
        cards.shuffle()
    }

    fun draw() {
        if (cards.isEmpty()) {
            println("There are no cards in the deck anymore")
            return
        }
        val card = cards[0]
        println("You picked the ${card.name}")
        cards.remove(card)
    }
}