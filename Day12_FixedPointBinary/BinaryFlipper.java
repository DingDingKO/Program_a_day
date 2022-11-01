package Day12_FixedPointBinary;
/* Day 12:
* A program which finds the negative two's compliment version of a fixed point binary number.
* */
public class BinaryFlipper {
    private static double total = 1;

    public static String binaryFlipper(String binaryString, boolean isFractionPart) {
        int twosCompliment = ~Integer.parseInt(binaryString, 2);
        int binaryStringLength = binaryString.length();
        if (isFractionPart) {
            twosCompliment += 1; // to add 1 to the most right-handed bit
            total += twosCompliment / (Math.pow(2,binaryString.length()));
        } else {
            if (binaryString.charAt(0) == '1') { // check if binary is negative
                total += Math.pow(2, binaryStringLength);
            }
            total += twosCompliment;
        }


        return Integer.toBinaryString(twosCompliment).substring(32 - binaryStringLength, 32);

    }
    public static double getTotal() {
        return total;
    }
}
