package Day12_FixedPointBinary;

import java.util.Scanner;

import static Day12_FixedPointBinary.BinaryFlipper.binaryFlipper;
import static Day12_FixedPointBinary.BinaryFlipper.getTotal;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter Binary: ");
        String binaryString = scanner.nextLine();
        String[] binarySplit = binaryString.split("\\.");

        String intPart = binaryFlipper(binarySplit[0], false);
        String fractionPart = binaryFlipper(binarySplit[1], true);

        System.out.print(intPart + "." + fractionPart);
        System.out.println(" = " + getTotal());

    }

}
