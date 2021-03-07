package novi.basics.tripledigits;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TripleDigits game for Novi Hogeschool by Bart Vriesema

        // Add variables
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int sumOfDigits;
        int productOfDigits;
        Scanner input = new Scanner(System.in);

        //Add randomizer and determine maximum value
        Random randomizer = new Random();
        int maxNumber = 9;

        // Create random numbers
        firstDigit = randomizer.nextInt(maxNumber) + 1;
        secondDigit = randomizer.nextInt(maxNumber) + 1;
        thirdDigit = randomizer.nextInt(maxNumber) + 1;

        // Calculate sum and product
        sumOfDigits = firstDigit + secondDigit + thirdDigit;
        productOfDigits = firstDigit * secondDigit * thirdDigit;

        System.out.println("Sum of numbers: " + sumOfDigits);
        System.out.println("Product of numbers: " + productOfDigits);

        //Give multiple attempts to player
        int maxNumberOfAttempts = 3;
        boolean userHasWon = false;
        boolean userContinuePlaying = true;

        while (userContinuePlaying) {

            while (!userHasWon) {
                // Read user input

                System.out.println("Voer drie getallen in (1-9): ");
                int userInput1 = input.nextInt();
                int userInput2 = input.nextInt();
                int userInput3 = input.nextInt();

                // Add win conditions to application
                int userSum = userInput1 + userInput2 + userInput3;
                int userProduct = userInput1 * userInput2 * userInput3;

                userHasWon = userSum == sumOfDigits && userProduct == productOfDigits;

                if (userHasWon) {
                    System.out.println("Gefeliciteerd, je hebt gewonnen");
                } else {
                    System.out.println("Helaas, dat is niet correct");
                }

            }


            System.out.println("Wil je verder spelen? ");
            String userContinuePlayingChoice = input.next();

            switch (userContinuePlayingChoice) {
                case "y": {
                    System.out.println("Je wilt verder spelen");
                    userContinuePlaying = true;
                    break;
                }
                case "n": {
                    System.out.println("Je wilt stoppen");
                    userContinuePlaying = false;
                    break;
                }
                default: {
                    System.out.println("Je hebt een ongeldige keuze gemaakt");
                    break;
                }
            }


        }
        System.out.println("Het spel is afgelopen.");
    }


}

