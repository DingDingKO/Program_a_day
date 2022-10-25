package com.Day5_Bitwise;

public class TwosComplement {
    public static String TwosComplementFinder(byte binary) {
        return Integer.toBinaryString(~binary + 1);
    }

    public static void main(String[] args) {
        byte five = 0b101;
        System.out.println(TwosComplementFinder(five));
    }
}
