package Day26_Threads;
/* Day 26:
* A program which explores Threads
* */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final long startTime = System.currentTimeMillis();

        ThreadExample t1 = new ThreadExample(1);
        ThreadExample t2 = new ThreadExample(2);
        ThreadExample t3 = new ThreadExample(3);
        ThreadExample t4 = new ThreadExample(4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        final long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime));
    }
}
/*
* The time to complete all 100 numbers is around 40 ms, even though
* each time a number is printed, the thread waits for 1 ms.
*
* This shows the threads are working in parallel.
* */
