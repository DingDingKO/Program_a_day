package Day21_Scheduling;
/*Day 21:
 * A program which calculates the average wait time in a scheduler using FCFS.
 * I was planning on doing the other methods, but I've run out of time, so I'll do them tomorrow.
 * */

import Day22_Scheduling_Continued.SRTF;
import Day22_Scheduling_Continued.SRTF_Preempt;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static void averageWaitTime(ArrayList<WaitTime> waitTimes) {
        double totalWait = 0;
        for (WaitTime wait : waitTimes) {
            totalWait += wait.getWaitTime();
        }
        System.out.println("\nAv. Wait: "+ String.format("%.2f", totalWait / waitTimes.size()));
    }

    public static void main(String[] args) {
        Task[] tasks = TaskMaker.makeTaskList();

        System.out.println("Tasks:");
        Arrays.stream(tasks).forEach(System.out::println);

        System.out.println("\nFCFS:");
        ArrayList<WaitTime> fcfsWaitTime = FCFS.fcfs_scheduler(tasks);
        fcfsWaitTime.forEach(System.out::println);
        averageWaitTime(fcfsWaitTime);

        System.out.println("\nSRFT - non preemptive:");
        ArrayList<WaitTime> srtfWaittime = SRTF.srtf_scheduler(tasks);
        srtfWaittime.forEach(System.out::println);
        averageWaitTime(srtfWaittime);

        System.out.println("\nSRFT - preemptive:");
        ArrayList<WaitTime> srtf_preWaitTime = SRTF_Preempt.srtf_pre_scheduler(tasks);
        srtf_preWaitTime.forEach(System.out::println);
        averageWaitTime(srtf_preWaitTime);
    }
}
