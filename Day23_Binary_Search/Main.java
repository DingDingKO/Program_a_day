package Day23_Binary_Search;

import java.util.List;
/* Day 23:
 * A program which implements a Binary search
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> sortedList = List.of(1, 2, 3, 4, 7, 9, 11, 17, 20, 21, 22, 27, 30, 50, 68, 94, 100);
        System.out.println(BinarySearch.binarySearcher(sortedList, 95));
    }
}
