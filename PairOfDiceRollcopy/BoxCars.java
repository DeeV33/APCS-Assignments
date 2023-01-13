package PairOfDiceRollcopy;

public class BoxCars {

    public static void main(String[] args) {

        PairOfDice dice = new PairOfDice();
        int numBoxCars = 0;

        for (int i = 0; i < 1000; i++) {
            if (dice.roll() == 12) {
                numBoxCars++;
            }
        }

        System.out.println("\nYou got " + numBoxCars + " boxcars");
    }
}