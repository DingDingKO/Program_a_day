package com.Day6_Bubble_Sort;
/* Day 6:
* A program which implements Bubble Sort to sort an array of integers.
* I started this thing with an inefficient algorithm, so I guess I'm continuing the trend :)
* Maybe I'll get around to merge sort one day.
*  */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> unsorted) {
        for (int sorted = 0; sorted < unsorted.size(); sorted++) {
            for (int i = 0; i < unsorted.size() - sorted - 1; i++) {
                if (unsorted.get(i) > unsorted.get(i + 1)) {
                    int temp = unsorted.get(i);
                    unsorted.set(i, unsorted.get(i + 1));
                    unsorted.set(i + 1, temp);

                }
            }
        }
        return unsorted;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,3,2,9,4728,34,4,35,0,11,3));

        System.out.println(bubbleSort(integers).toString());

    }
}
