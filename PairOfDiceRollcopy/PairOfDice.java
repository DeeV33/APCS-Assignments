package PairOfDiceRollcopy;

import java.util.Random;

public class PairOfDice {
    private Random rand = new Random();
    private int numSides, faceValue1, faceValue2;

    public String toString() {
        return faceValue1 + " & " + faceValue2;
    }

    public PairOfDice() {
        numSides = 6;
        faceValue1 = 1;
        faceValue2 = 1;
    }

    public int getNumSides() {
        return numSides;
    }

    public int getfaceValue1() {
        return faceValue1;
    }

    public int getfaceValue2() {
        return faceValue2;
    }

    public int roll() {
        faceValue1 = rand.nextInt(1, numSides + 1);
        faceValue2 = rand.nextInt(1, numSides + 1);
        return faceValue1 + faceValue2;
    }

    private static void BoxCars(String[] args) {
        PairOfDice dice = new PairOfDice();
        int numBoxCars = 0;

        for (int i = 0; i < 1000; i++) {
            if (dice.roll() == 12) {
                numBoxCars++;
            }
        }

        System.out.println("\nYou got " + numBoxCars + " boxcars");
    }

    public static void main(String[] args) {
        BoxCars(args);
    }
}