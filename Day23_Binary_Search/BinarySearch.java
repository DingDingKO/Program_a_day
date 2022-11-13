package Day23_Binary_Search;

import java.util.List;

public class BinarySearch {
    public static boolean binarySearcher(List<Integer> list, int numToFind) {
        int middle = list.size() / 2;

        System.out.println(list);

        if (list.get(middle) == numToFind) {
            return true;

        } else if (middle == 0){
            return false;

        } else {
            if (list.get(middle) > numToFind) {
                return binarySearcher(list.subList(0, middle), numToFind);
            } else {
                return binarySearcher(list.subList(middle, list.size()), numToFind);
            }

        }
    }
}
