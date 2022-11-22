package Day33_Collatz_Conjecture;

public class StoppingTime {
    private static int count = 0;
    public int calculateStoppingTime(int n) {
        if (n == 1) {
            System.out.println(count);
            count = 0;
            return 1;
        } else {
            count += 1;
            return (n % 2 == 0) ? calculateStoppingTime(n / 2) : calculateStoppingTime(3 * n + 1);
        }
    }

}
