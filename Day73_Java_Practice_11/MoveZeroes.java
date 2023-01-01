package Day73_Java_Practice_11;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeros = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else if (zeros > 0) {
                int j = nums[i];
                nums[i] = 0;
                nums[i - zeros] = j;
            }

        }
    }
}
