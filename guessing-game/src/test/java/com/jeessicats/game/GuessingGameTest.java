package com.jeessicats.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    public static final int GAME_RANDOMNESS_RETRIES = 100;
    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        int ramdomNumber = game.getRamdomNumber();
        String message = game.guess(ramdomNumber);
        assertEquals("You win in 1 try!", message);
    }

    @Test
    public void testOneLoseNegativeSituation() {
        String message = game.guess(-11);
        assertEquals("You lose!", message);
    }

    @Test
    public void testOneLosePositiveSituation() {
        int randumNumber = game.getRamdomNumber();
        String message = game.guess(randumNumber + 1);
        assertEquals("You lose!", message);
    }

    @Test
    public void testRandomNumberGeneration() {
        // 1 2 3 4 5 6 7 8 9 10
        // 1 1 0 1 0 1 1 1 0 1 = 10

        int[] ramdomNumbersCount = new int[11];

        for (int counter = 0; counter < GAME_RANDOMNESS_RETRIES; counter++) {
            GuessingGame game = new GuessingGame();
            int randomNumber = game.getRamdomNumber();
            ramdomNumbersCount[randomNumber] = 1;
            }

        int sum = 0;

        for (int counter = 0; counter < 11; counter++) {
            sum += ramdomNumbersCount[counter];
        }
        assertEquals(10, sum);
    }

    @Test
    public void testFourWrongGuesses() {
        game.guess(-7);
        game.guess(-7);
        game.guess(-7);
        String mesage = game.guess(-7);
        assertEquals("You lose! You have four tries, Game Over!", mesage);
    }

    @Test
    public void testThreeWrongGuessesAndOneCorrect() {
        game.guess(-7);
        game.guess(-7);
        game.guess(-7);
        int randomNumber = game.getRamdomNumber();
        String mesage = game.guess(randomNumber);
        assertEquals("You win in 4 tries!", mesage);
    }
}
