package com.jeessicats.blackjack;

public enum Rank {

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
    KING;

    public int getValue() {
        if (this == Rank.KING || this == Rank.QUEEN || this == Rank.JACK) {
            return 10;
        } else if (this == Rank.ACE) {
            return 11; // Default value for ACE
        } else {
            return ordinal() + 1;
        }
    }
}

