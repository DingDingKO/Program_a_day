package Day33_Collatz_Conjecture;

public class Main {
    public static void main(String[] args) {
        StoppingTime stoppingTime = new StoppingTime();

        System.out.println("Stopping time: ");
        for (int i = 1; i < 100000; i++) {
            System.out.printf(i + ": ");
            stoppingTime.calculateStoppingTime(i);
        }
    }
}
