package Day44_Advent_Calendar_Bingo;

import java.lang.reflect.Array;
import java.util.*;

public class Board {
    ArrayList<Integer> days = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25));
    int[][] adventCalendar;
    final int BOARD_SIZE = 5;


    public Board() {
        this.adventCalendar = new int[BOARD_SIZE][BOARD_SIZE];
        Collections.shuffle(days);

        for (int i = 0; i < days.size(); i++) {
            adventCalendar[i % BOARD_SIZE][i / BOARD_SIZE] = days.get(i);
        }
    }

    public int countRows() {
        int rowCount = 0;

        for (int row = 0; row < BOARD_SIZE; row++) {
            int count = 0;
            for (int column = 0; column < BOARD_SIZE; column++) {

                if (adventCalendar[row][column] == 0) {
                    count++;
                }
            }
            if (count == BOARD_SIZE) {
                rowCount++;
            }

        }

        return rowCount;
    }
    public int countColumns() {
        int columnCount = 0;

        for (int column = 0; column < BOARD_SIZE; column++){
            int count = 0;
             for (int row = 0; row < BOARD_SIZE; row++) {
                if (adventCalendar[row][column] == 0) {
                    count++;
                }
            }
            if (count == BOARD_SIZE) {
                columnCount++;
            }

        }

        return columnCount;
    }

    public void replace(int value) {
        for (int i = 0; i < days.size(); i++) {
            if (adventCalendar[i % BOARD_SIZE][i / BOARD_SIZE] == value) {
                adventCalendar[i % BOARD_SIZE][i / BOARD_SIZE] = 0;
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("\n");
        for (int[] row : adventCalendar) {
            System.out.println(Arrays.toString(row));
        }
        return "";
    }
}
