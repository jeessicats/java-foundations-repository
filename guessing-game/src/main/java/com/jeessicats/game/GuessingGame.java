package com.jeessicats.game;

import java.util.Random;

public class GuessingGame {

    private final int ramdomNumber = new Random().nextInt(10) + 1;

    private int counter = 0;

    public String guess(int guessedNumber) {
        counter++;
        if (counter == 4 && guessedNumber != getRamdomNumber()) {
            return "You lose! You have four tries, Game Over!";
        }

        String tryText = counter == 1 ? "try" : "tries";

        String winningMsg = String.format("You win in %d %s!", counter, tryText);
        return guessedNumber == getRamdomNumber() ? winningMsg : "You lose!";
    }

    public int getRamdomNumber() {
        return ramdomNumber;
    }
}
