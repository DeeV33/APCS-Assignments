package DiceRoll;

public class Dice {
    private int numSides, faceValue;

    public String toString() {
        return " " + faceValue;
    }

    public Dice() {
        numSides = 6;
        faceValue = 1;
    }

    public Dice(int sides) {
        numSides = sides;
        faceValue = 1;
    }

    public int getNumSides() {
        return numSides;
    }

    public int getfaceValue() {
        return faceValue;
    }

    public int roll() {
        faceValue = (int) (Math.random() * numSides + 1);
        return faceValue;
    }
}