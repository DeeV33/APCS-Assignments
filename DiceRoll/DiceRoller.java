package DiceRoll;

import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        // Creates 2 6-sided dice and a scanner
        Dice die1 = new Dice();
        Dice die2 = new Dice();
        Scanner scan = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {

            // Menu for user to choose between exit, rolling D6, and rolling 2 custom die
            System.out.println("\n0 - Exit\n1 - Roll D6\n2 - Roll custom die");
            choice = scan.nextInt();
            scan.nextLine(); // .nextLine() is used to "close" the input after the user presses enter

            if (choice == 0) {

                System.out.println("\nAdios");
                scan.close();

            } else if (choice == 1) {

                String keepRolling = "y";

                while (!(keepRolling.equals("n"))) {

                    die1.roll();
                    die2.roll();
                    System.out.println("\nFirst roll is" + die1.toString() + "\nSecond roll is" + die2.toString());
                    System.out.println("\nWould you like to roll again? (\"y/n\")");
                    keepRolling = scan.next();
                    scan.nextLine();

                }

            } else if (choice == 2) {

                String keepRolling = "y";

                System.out.println("\nHow many sides should die 3 have?");
                int numSides = scan.nextInt();
                scan.nextLine();
                Dice die3 = new Dice(numSides);

                System.out.println("\nHow many sides should die4 have?");
                numSides = scan.nextInt();
                scan.nextLine();
                Dice die4 = new Dice(numSides);

                while (!(keepRolling.equals("n"))) {

                    die3.roll();
                    die4.roll();
                    System.out.println("\ndie3 rolled" + die3.toString() + "\ndie4 rolled" + die4.toString());
                    System.out.println("\nWould you like to roll again? (\"y/n\")");
                    keepRolling = scan.next();
                    scan.nextLine();

                }

            }
        }
    }
}
