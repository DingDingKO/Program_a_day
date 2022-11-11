package Day21_Scheduling;

public class TaskMaker {
    // arrival time and burst time
    private static final double[][] arrivalTimeAndBurst = {
            {0, 2},
            {0.4, 1},
            {3, 5},
            {3, 0.2},
            {4, 1},
            {4.1, 0.5},
            {4.5, 3},
            {5, 0.1},
            {6, 10},
            {6, 0.1}

    };

    public static Task[] makeTaskList() {
        Task[] tasks = new Task[arrivalTimeAndBurst.length];

        for (int i = 0; i < arrivalTimeAndBurst.length; i++) {
            tasks[i] = new Task("Task: " + (i + 1), arrivalTimeAndBurst[i][0], arrivalTimeAndBurst[i][1]);
        }
        return tasks;

    }
}
