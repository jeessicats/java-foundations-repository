package com.jeessicats.blackjack;

public enum Suit {
    CLUBS ("♣"),
    DIAMONDS ("♦"),
    HEARTS ("♥"),
    SPADES ("♠");

    private String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
