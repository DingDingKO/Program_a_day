package Day7_Digits;
/* Day 7:
* A program which add up all the digits in a number up.
* It uses methods from the String class and multiple declarations/actions in the for loop because
* I looked over my notes today, and they looked cool.
*
* Also, what's up with IntelliJ having an inbuilt spelling and grammar checker. I'm fine with it telling me my code
* is shit, but now it's telling me my sentences are poorly worded and misspelt too?
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println(sumDigits(num));
    }

    private static int sumDigits(int number) {
        String numberString = Integer.toString(number);

        int i;
        int sum;
        int digit;
        char digitChar;
        /* An interesting way of doing the for loop, declaring everything first, then assigning the variables in the
        * for loop. Also, the sum is incremented in the for loop top bit rather than in the body. It's probably more
        * readable to just put it in the body, but I just learnt how to do it today, so I'll give it a try.
        * */

        for(i = 0, sum = 0; i < numberString.length(); i++, sum += digit){
            digitChar = numberString.charAt(i);
            digit = Integer.parseInt(Character.toString(digitChar));
        }
        return sum;
    }
}
