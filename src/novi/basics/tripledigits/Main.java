package novi.basics.tripledigits;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // TripleDigits game for Novi Hogeschool by Bart Vriesema

        // Add variables
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int maxNumber = 9;
        int sumOfDigits;
        int productOfDigits;

        Random randomizer = new Random();

        firstDigit = randomizer.nextInt(maxNumber) + 1;
        secondDigit = randomizer.nextInt(maxNumber) + 1;
        thirdDigit = randomizer.nextInt(maxNumber) + 1;
        sumOfDigits = firstDigit + secondDigit + thirdDigit;
        productOfDigits = firstDigit * secondDigit * thirdDigit;

        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
        System.out.println(sumOfDigits);
        System.out.println(productOfDigits);


    }
}
