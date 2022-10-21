/* Day 1:
* A program to find prime numbers using Wilson's theorem: ((n - 1)! + 1)/n is only an integer when n is prime.
* It's horribly inefficient but still pretty cool.
* */

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Day1_Primes {
    final static int NUMS_UP_TO = 20;
    static ArrayList<Double> wilsonNumberMaker(int amountOfNums) {
        double factorial = 1d;
        ArrayList<Double> factorials = new ArrayList<Double>(amountOfNums);

        for (int i = 1; i <= amountOfNums; i++) {
            factorial = i * factorial;
            factorials.add(((factorial) + 1) / (i + 1));
        }
        // factorial array starts with n = 2 since using factorial rather than factorial - 1, since 1! is (2 - 1)!
        return factorials;
    }

    static void printPrimes(ArrayList<Double> factorials) {
        // need to add two to the indexes since the indexes start at 0 and the factorials start at n = 2
        IntStream.range(0, factorials.size()).filter(i -> factorials.get(i) % 1 == 0).map(n -> n+2).forEach(System.out::println);
    }
    public static void main(String[] args) {
        ArrayList<Double> factorials = wilsonNumberMaker(NUMS_UP_TO);
        System.out.println(factorials);
        printPrimes(factorials);

    }
}
/* The last two numbers, 20 and 21, are NOT primes.
* This is because the values, 6.0822550204416E15 and 1.1585247657984E17, have a larger exponent than the amount of
* decimal places in the mantissa so will turn up true with % 1 == 0 even though its because there isn't enough accuracy.
*
* As I said, it's a horribly inefficient algorithm.
* */