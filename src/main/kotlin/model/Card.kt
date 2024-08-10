package avinot.model

data class Card(val value: String, val color: String, val name: String = "$value of $color") {

    enum class StandardColor {
        DIAMOND,
        HEART,
        SPADE,
        CLUBS
    }

    enum class StandardValue{
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }
}