package Day9_RpnCalculator;
/* Day 9:
* A program which calculates sums using RPN notation - This is a solution to LeetCode problem 150.
* Runtime: 5 ms, beats 97.56%
* Memory Usage: 43.6 MB, beats 79.53%
* */
import java.util.ArrayList;

public class RPN_Calculator {

    static final String OPERATORS = "+-/*";

    private static ArrayList<Integer> evaluate(ArrayList<Integer> stack, String operator){
        int stackLength = stack.size();

        int secondToLastIndex = stackLength - 2;
        int lastIndex = stackLength - 1;

        int secondToLastNumber = stack.get(secondToLastIndex);
        int lastNumber = stack.get(lastIndex);

        stack.remove(lastIndex);
        stack.remove(secondToLastIndex);


        int result;
        switch(operator){
            case "+" -> result = secondToLastNumber + lastNumber;
            case "*" -> result = secondToLastNumber * lastNumber;
            case "/" -> result = secondToLastNumber / lastNumber;
            case "-" -> result = secondToLastNumber - lastNumber;
            default -> result = 0;
        }
        stack.add((int)result);
        return stack;
    }
    public static int evalRPN(String[] tokens) {
        ArrayList<Integer> realNumberStack = new ArrayList<>();


        for (String value : tokens) {
            if (OPERATORS.contains(value)) {
                realNumberStack = evaluate(realNumberStack, value);
            } else {
                realNumberStack.add(Integer.parseInt(value));
            }
        }

        return realNumberStack.get(0);
    }


    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4","13","9","+","8","5","/","+","*"}));
    }

}
