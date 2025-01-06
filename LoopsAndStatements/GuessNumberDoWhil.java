package LoopsAndStatements;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberDoWhil{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(10) + 1; 
        int guess;

        System.out.println("Guess the number (between 1 and 10): ");
        do {
            guess = scanner.nextInt();
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! The number was " + targetNumber);
            }
        } while (guess != targetNumber);

        scanner.close();
    }
}

