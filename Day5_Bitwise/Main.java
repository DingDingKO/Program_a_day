package com.Day5_Bitwise;
/* Day 5
* A quick look at bitwise operators. I had a test today so I was a bit busy.
* */

public class Main {
    public static void main(String[] args) {
        System.out.println(6|9); // OR - same as + if they don't have 1's in the same places
        System.out.println(6&9); // AND
        System.out.println(6 ^ 9); // XOR
        System.out.println(~9); // Complement - add one to find 2's complement value
    }
}
