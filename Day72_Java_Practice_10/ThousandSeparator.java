package Day72_Java_Practice_10;

public class ThousandSeparator {
    public String thousandSeparator(int n) {
        StringBuilder result = new StringBuilder(Integer.toString(n));

        for(int i = result.length() - 3; i > 0; i-=3){
            result.insert(i,'.');
        }
        return result.toString();
    }
}
