package Day13_Generics;
/*Day 13:
* A quick look at generics
* */

public class Main {
    private static <T> String formatToStringList(T[] toAdd) {
        StringBuilder total = new StringBuilder();

        for (int i = 0; i < toAdd.length; i++) {
            total.append(toAdd[i].toString());
            total.append(", ");
        }
        
        return total.toString();
    }

    public static void main(String[] args) {
        String[] stringList = {"A", "B", "CD"};
        Character[] charList = {'A', 'B', 'C', 'D'};
        Integer[] intList = {1, 2, 3, 4};
        Double[] doubleList = {1.1, 2.2, 3.3, 4.4};
        Float[] floatList = {1.1f, 2.2f, 3.3f, 4.4f};
        Boolean[] booleanList = {true, false, true, false};
        Short[] shortList = {1, 2, 3, 4};
        Long[] longList = {1L, 2L, 3L, 4L};
        Byte[] byteList = {1, 2, 3, 4};

        System.out.println(formatToStringList(stringList));
        System.out.println(formatToStringList(charList));
        System.out.println(formatToStringList(intList));
        System.out.println(formatToStringList(doubleList));
        System.out.println(formatToStringList(floatList));
        System.out.println(formatToStringList(booleanList));
        System.out.println(formatToStringList(shortList));
        System.out.println(formatToStringList(longList));
        System.out.println(formatToStringList(byteList));
    }
}
