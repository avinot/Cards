package avinot

import avinot.model.Deck
import avinot.model.PokerDeck
import avinot.model.TarotDeck
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var input: Int
    var deck: Deck? = null
    do {
        println("What do you want to do?")
        println("[0] Exit")
        println("[1] Pick Poker deck")
        println("[2] Pick Tarot deck")
        println("[3] Shuffle deck")
        println("[4] Draw a card")

        input = reader.nextInt()

        when (input) {
            0 -> println("Exit...")
            1 -> deck = PokerDeck()
            2 -> deck = TarotDeck()
            3 -> {
                if (deck == null) {
                    println("You need to pick a deck first")
                }
                println()
                deck?.shuffle()
            }
            4 -> {
                if (deck == null) {
                    println("You need to pick a deck first")
                }
                println()
                deck?.draw()
            }
            else -> {
                println("No action defined for input $input")
            }
        }
    } while (input != 0)
}