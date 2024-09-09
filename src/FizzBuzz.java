/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;

        while (i < 100) {
            // Find out which numbers divide i.
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            // Print out result as appropriate
            if (divBy3 && divBy5) {
                System.out.println("Fizz Buzz");
            } else if (divBy3) {
                System.out.println("Fizz");
            } else if (divBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

            // Finally, increment i.
            i++;
        }
    }
}
