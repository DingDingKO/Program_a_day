package Day22_Scheduling_Continued;

import Day21_Scheduling.Task;
import Day21_Scheduling.WaitTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SRTF_Preempt {



    public static ArrayList<WaitTime> srtf_pre_scheduler(Task[] tasks) {
        double time = 0;
        double timeDelta;

        ArrayList<Task> waitingToExecute = new ArrayList<>(List.of(tasks));
        ArrayList<WaitTime> waitTimes = new ArrayList<>();

        System.out.println("0.0");

        while (waitingToExecute.size() > 0){
            double currentTime = time;

            Task lowestTimeLeftTask = waitingToExecute.stream().filter(t -> t.getArrivalTime() <= currentTime).reduce((a, b) -> a.getBurstTime() < b.getBurstTime() ? a : b).get();
            Double nextArrivalTime = waitingToExecute.stream().map(t -> t.getArrivalTime() - currentTime).filter(t -> t > 0).reduce((a, b) -> a > b ? b : a).orElse(1000d);

            timeDelta = Math.min(nextArrivalTime, lowestTimeLeftTask.getBurstTime());

            time += timeDelta;
            System.out.println(lowestTimeLeftTask.getTaskName());
            System.out.println(String.format("%.1f",time));

            waitingToExecute.remove(lowestTimeLeftTask);

            if (lowestTimeLeftTask.getBurstTime() - timeDelta > 0) {
                waitingToExecute.add(new Task(lowestTimeLeftTask.getTaskName(), lowestTimeLeftTask.getArrivalTime(), lowestTimeLeftTask.getBurstTime() - timeDelta));
            }
            else{
                Task originalTask = Arrays.stream(tasks).filter(t -> Objects.equals(t.getTaskName(), lowestTimeLeftTask.getTaskName())).findFirst().get();
                waitTimes.add(new WaitTime(lowestTimeLeftTask.getTaskName(), time - lowestTimeLeftTask.getArrivalTime() - originalTask.getBurstTime(), originalTask.getBurstTime()));
            }


        }
        System.out.println("\nTotal time: " + time);
        return waitTimes;
    }
}