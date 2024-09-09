/**
 * Solve the Reduce challenge as described in Lab 1.
 */

public class Reduce {

    public static void main(String[] args) {

        // Keep track of the number to reduce and the number of steps taken
        int num = 100;
        int nSteps = 0;

        // Reduce the number
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }

            nSteps++;
        }

        // Print out the final number of steps
        System.out.println("It took " + nSteps + " steps to reduce the number to 0.");

    }

}
