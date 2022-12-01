package Day42_Java_Practice_2;

public class sqrt {
    public int mySqrt(int x) {

        if(x == 1){
            return 1;
        }

        long lower_limit =  0;
        long upper_limit = x;
        long candidate = 0;
        long candidate_squared = 0;

        while(true){
            candidate = (lower_limit + upper_limit)/2;

            candidate_squared = candidate * candidate;
            if(candidate_squared < x && (candidate +1) * (candidate+1) >x){
                return (int)candidate;
            }
            else if(candidate_squared < x){
                lower_limit = candidate + 1;
            }
            else if(candidate_squared > x){
                upper_limit = candidate - 1;
            }
            else{
                return (int)candidate;
            }
        }
    }

    public static void main(String[] args) {
        sqrt sqrt = new sqrt();
        System.out.println(sqrt.mySqrt(8));
    }
}
