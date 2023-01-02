package Day74_Difference_Square;

public class Difference {
    public static int[] getDiff(int[] nums) {
       return new int[]{Math.abs(nums[0] - nums[1]), Math.abs(nums[1] - nums[2]), Math.abs(nums[2] - nums[3]), Math.abs(nums[3] - nums[0])};
    }
}
