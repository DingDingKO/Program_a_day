package Day21_Scheduling;

public class WaitTime {
    String taskName;
    double waitTime;
    double burstTime;

    public WaitTime(String taskName, double waitTime, double burstTime) {
        this.taskName = taskName;
        this.waitTime = waitTime;
        this.burstTime = burstTime;
    }

    public String getTaskName() {
        return taskName;
    }

    public double getWaitTime() {
        return waitTime;
    }

    public double getBurstTime() {
        return burstTime;
    }

    @Override
    public String toString() {
        return taskName + ": " +
                "Wait Time: " + String.format("%.1f",waitTime) +
                ", Burst Time: " + String.format("%.1f",burstTime);
    }
}
