package com.Day2_Recursion;/* Day 2:
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
/* Outputs:
Sociable Number: - Divisor Chain
1264460
1547860
1727636
1305184

Amicable Number: - Each numbers divisors' equals the other number
220
284

Perfect Number: - Divisors equal the number
28

Normal Number:
360
810
1368
2532
3404
2980
3320
4240
5804
4360
5540
6136
6464
6490
6470
5194
4040
5140
5696
5734
3194
1600
2337
1023
513
287
49
8
7
1
* */
