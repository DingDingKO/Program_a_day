package Day26_Threads;

public class ThreadExample extends Thread{
    private static int n = 0;
    private int threadNumber;

    public ThreadExample(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        while (n < 100){
            n++;
            System.out.println(n + " from thread "+ threadNumber);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
