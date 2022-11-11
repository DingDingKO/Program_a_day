package Day22_Scheduling_Continued;

import Day21_Scheduling.Task;
import Day21_Scheduling.WaitTime;

import java.util.ArrayList;
import java.util.List;
/* Day 22:
* A continuation of Day 21 to include SRTF (Preemptive and Not). I have also almost completely reworked yesterday's
* code to put everything into Objects and to use Arraylists instead of Arrays
* */

public class SRTF {
    public static ArrayList<WaitTime> srtf_scheduler(Task[] tasks) {
        double time = 0;
        int columnLength = tasks.length;
        ArrayList<Task> waitingToExecute = new ArrayList<>(List.of(tasks));
        ArrayList<WaitTime> waitTimes = new ArrayList<>();

        while (waitingToExecute.size() > 0){
            double finalTime = time;

            Task task = waitingToExecute.stream().filter(t -> t.getArrivalTime() <= finalTime).reduce((a, b) -> a.getBurstTime() < b.getBurstTime() ? a : b).get();

            System.out.printf("%.1f%n",time);
            System.out.println(task.getTaskName());

            waitingToExecute.remove(task);

            waitTimes.add(new WaitTime(task.getTaskName(), time - task.getArrivalTime(), task.getBurstTime()));

            time += task.getBurstTime();
        }
        System.out.println(time);

        System.out.println("\nTotal time: " + time);
        return waitTimes;
    }
}