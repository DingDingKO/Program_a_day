package Day21_Scheduling;
/*Day 21:
 * A program which calculates the average wait time in a scheduler using FCFS.
 * I was planning on doing the other methods, but I've run out of time, so I'll do them tomorrow.
 * */

import java.util.Arrays;

public class Main {
    private static double averageWaitTime(double[][] waitTimes) {
        double totalWait = 0;
        for (double wait[] : waitTimes) {
            totalWait += wait[1];
        }
        return totalWait / waitTimes.length;
    }

    public static void main(String[] args) {

        // task number, arrival time, and burst time
        double[][] tasks = {
                {1, 0, 2},
                {2, 0.4, 1},
                {3, 3, 5},
                {4, 3, 0.2},
                {5, 4, 1},
                {6, 4.1, 0.5},
                {7, 4.5, 3},
                {8, 5, 0.1},
                {9, 6, 10},
                {10, 6.1, 0.1}

        };

        double[][] fcfsWaitTime = FCFS.fcfs_scheduler(tasks);
        System.out.println(Arrays.deepToString(fcfsWaitTime));
        System.out.println(averageWaitTime(fcfsWaitTime));
    }
}
