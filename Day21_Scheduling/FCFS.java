package Day21_Scheduling;

public class FCFS {

    public static double[][] fcfs_scheduler(double[][] tasks) {
        double time = 0;
        int columnLength = tasks.length;
        double[][] wait_times = new double[columnLength][columnLength];

        for (int i = 0; i < columnLength; i++) {
            if (time <= tasks[i][1]) {
                time = tasks[i][1];
            }
            wait_times[i] = new double[]{tasks[i][0], time - tasks[i][1]};
            time += tasks[i][2];
        }


        return wait_times;

    }
}
