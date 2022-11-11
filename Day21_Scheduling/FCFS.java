package Day21_Scheduling;

import java.util.ArrayList;

public class FCFS {

    public static ArrayList<WaitTime> fcfs_scheduler(Task[] tasks) {
        double time = 0;

        ArrayList<WaitTime> waitTimes = new ArrayList<>();
        for (Task task : tasks) {
            if (time <= task.getArrivalTime()) {
                time = task.getArrivalTime();
            }

            System.out.printf("%.1f%n",time);

            System.out.println(task.getTaskName());
            waitTimes.add(new WaitTime(task.getTaskName(), time - task.getArrivalTime(), task.getBurstTime()));
            time += task.getBurstTime();
        }
        System.out.println(time);

        System.out.println("\nTotal time: " + time);
        return waitTimes;

    }
}
