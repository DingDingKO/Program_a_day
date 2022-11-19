package Day30_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Passcode {
    public static String[] passcodeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Passcode (Digits separated with spaces): ");
        String stringPasscode = scanner.nextLine();
        return stringPasscode.split("\\s+");
    }
    public static void outputWords(String[] numbers) {
        MapFactory mapFactory = new MapFactory();
        HashMap<Integer, String> numberToWord = mapFactory.makeMap();

        System.out.println("Your passcode is: ");
        for (String number: numbers) {
            System.out.println(numberToWord.get(Integer.parseInt(number)));
        }
    }
}
