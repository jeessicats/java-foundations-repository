package com.jeessicats.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void canGetValueOfATwoCard() {
        Card heartAce = new Card(Suit.HEARTS, Rank.TWO);
        assertEquals(2, heartAce.getValue(), "The value of the card should be 2");
    }

    @Test
    void canGetValueOfAThreeCard() {
        Card heartAce = new Card(Suit.HEARTS, Rank.THREE);
        assertEquals(3, heartAce.getValue(), "The value of the card should be 2");
    }
}