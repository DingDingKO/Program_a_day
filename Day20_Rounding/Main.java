package Day20_Rounding;
/*Day 20:
* A demonstration of different ways to round a number to a certain amount of decimal places.
* 1) Using Math.round().
* 2) Using, what seems to me to be Magic, a method I saw in the back of the textbook.
* 3) Using String format.
* */

public class Main {
    final static double pi = Math.PI;

    private static double rounding_Math(double number, double places) {
        double powerOfTen = Math.pow(10, places);
        return Math.round(number * powerOfTen) / powerOfTen;
    }

    private static double rounding_Magic(double number, double places) {
        int powerOfTen = (int) Math.pow(10, places);
        number *= powerOfTen;
        number += 0.5;
        number = (int) number;
        return number / powerOfTen;
    }

    private static Double rounding_String(double number, int places) {
        String numberAsString = String.format("%." + places + "f", number);
        return Double.parseDouble(numberAsString);
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(rounding_Math(pi, 7));
        System.out.println(rounding_Magic(pi, 7));
        System.out.println(rounding_String(pi, 7));
    }
}
/* Output:
3.141592653589793
3.1415927
3.1415927
3.1415927
* */