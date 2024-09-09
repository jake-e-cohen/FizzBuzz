/**
 * Solve the Multiples challenge as described in Lab 1.
 */

public class Multiples {

    public static void main(String[] args) {

        // Keep track of the number of multiples of 3 and 5
        int nMultiples = 0;

        // Count the number of positive multiples of 3 or 5 that occur below 1000
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                nMultiples++;
            }
        }

        System.out.println("There are " + nMultiples + " positive multiple(s) of 3 or 5 less than 1000.");

    }

}
