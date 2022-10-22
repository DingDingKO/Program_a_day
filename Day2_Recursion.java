/* Day 2:
* A recursive program which finds the divisors of a number and adds them together to demonstrate
* Sociable, Amicable, and Perfect numbers.
* */

public class Day2_Recursion {
    private static int sumDivisors(int n, int startingNumber) {
        System.out.println(n);
        int halfOfN = n / 2;
        int total = 1;

        for (int i = 2; i <= halfOfN; i++) {
            // Add if divisor
            if (n % i == 0) {
                total += i;
            }
        }
        // Stop if divisor total equal the number or its a loop
        if (total == n || total == startingNumber) {
            return n;
        } else {
            return sumDivisors(total, startingNumber);
        }
    }

    public static void main(String[] args) {

        System.out.println("\nSociable Number: - Divisor Chain");
        sumDivisors(1264460,1264460);

        System.out.println("\nAmicable Number: - Each numbers divisors' equals the other number");
        sumDivisors(220,220);

        System.out.println("\nPerfect Number: - Divisors equal the number");
        sumDivisors(28, 28);

        System.out.println("\nNormal Number:");
        sumDivisors(360, 360);
    }
}
