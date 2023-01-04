class Solution {
    public int[] getConcatenation(int[] nums) {
        int numLength = nums.length;

        int[] result = new int[2*numLength];
        for(int i = 0; i < 2*numLength; i++){
            result[i] = nums[i%numLength];
        }
        return result;
    }
}