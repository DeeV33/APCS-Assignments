/**
 * @DeeV33
 */

package PairOfDiceRoll;

import java.util.Scanner;

public class Pig {

    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();
        Scanner scan = new Scanner(System.in);
        int playerPoints = 0;
        int computerPoints = 0;

        Boolean PlayerTurn = true;

        while (playerPoints < 100 && computerPoints < 100) {

            while (PlayerTurn) {

                if (playerPoints >= 100 || computerPoints <= 100) {
                    break;
                }

                int roundPoints = 0;
                dice.roll();
                System.out.println("You rolled" + dice);

                if ((dice.getfaceValue1() == 1) && (dice.getfaceValue2() == 1)) {

                    System.out.println("Oh no! You lost all your points!");
                    PlayerTurn = !(PlayerTurn);
                    playerPoints = 0;

                } else if ((dice.getfaceValue1() == 1) || (dice.getfaceValue2() == 1)) {

                    System.out.println("Oh no! You lost all your points for this round!");
                    PlayerTurn = !(PlayerTurn);
                    roundPoints = 0;

                } else {

                    roundPoints += dice.getfaceValue1() + dice.getfaceValue2();

                }

                System.out.println("Would you like to be a pig and roll again?");

            }
        }
    }
}
