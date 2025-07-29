package com.jeessicats.blackjack;

public class Card {

    private Suit suit;
    private Rank rank;

    // its a method that allows you to initialize the new object
    // it is called a constructor
    // it has the same name as the class
    // it does not have a return type
    // it is used to set the initial state of the object
    // it is called when you create a new object of the class
    // it is used to set the initial state of the object

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // getters and setters are methods that allow you to access and modify the private fields of the class
    // getters are used to get the value of the private fields
    // setters are used to set the value of the private fields
    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        Card heartAce = new Card(Suit.CLUBS, Rank.ACE);
        Card diamondKing = new Card(Suit.DIAMONDS, Rank.KING);
    }

    public int getValue() {
        return this.rank.getValue();
    }


}
