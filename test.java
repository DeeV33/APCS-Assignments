import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class test {
    public static void main(String[] args) {
        /*
         * String name = "ADRIANA";
         * Scanner scan = new Scanner(System.in);
         * int count = 0;
         * for (int i = 0; i < name.length(); i++) {
         * if (name.toLowerCase().charAt(i) == 'a') {
         * count++;
         * }
         * }
         * System.out.println("The letter \'a\' appears in " + name + " " + count +
         * " times.");
         */
        String str = "Sussus Amogus";
        String everyOther = "";

        for (int i = 0; i < str.length(); i += 2) {
            if ((i) <= str.length()) {
                everyOther = everyOther + str.charAt(i);
            }
        }

        System.out.println("Every other character of " + str + " is: " + everyOther);
    }
}
