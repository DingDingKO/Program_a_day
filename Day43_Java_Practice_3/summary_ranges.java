package Day43_Java_Practice_3;

import java.util.ArrayList;
import java.util.List;

public class summary_ranges {
    private String addString(int start, int end) {
        if (start != end) {
            return start + "->" + end;
        } else {
            return ""+start;
        }
    }
    public List<String> summaryRanges(int[] nums) {

        ArrayList<String> ranges = new ArrayList<>();

        if(nums.length == 0){
            return ranges;
        }

        int start = nums[0];
        int end = nums[0];

        for(int i = 1; i < nums.length; i++){
            if (end + 1 == nums[i]) {
                end = nums[i];
            } else {
                ranges.add(addString(start, end));
                start = nums[i];
                end = nums[i];
            }
        }
        ranges.add(addString(start,end));
        return ranges;
    }

    public static void main(String[] args) {
        summary_ranges summary_ranges = new summary_ranges();
        int[] ints = {1,2,3,4,5,7,8,9,20,75,76};
        System.out.println(summary_ranges.summaryRanges(ints));
    }
}
