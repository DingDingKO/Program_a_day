package Day21_Scheduling;

public class Task {
    private String taskName;
    private double arrivalTime;
    private double burstTime;

    public Task(String taskName, double arrivalTime, double burstTime) {
        this.taskName = taskName;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }

    public String getTaskName() {
        return taskName;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getBurstTime() {
        return burstTime;
    }

    @Override
    public String toString() {
        return taskName + ": " +
                "Arrival Time: " + String.format("%.1f",arrivalTime) +
                ", Burst Time: " + String.format("%.1f",burstTime);
    }
}
