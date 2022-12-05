package Day46_Java_Practice_4;

public class Fibonacci_Number {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }

        int lastLastVal = 0;
        int lastVal= 1;
        int temp = 0;

        for(int i = 1; i < n;i++){
            temp = lastVal + lastLastVal;
            lastLastVal = lastVal;
            lastVal = temp;
        }
        return lastVal;
    }
}
