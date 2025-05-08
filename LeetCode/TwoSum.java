package LeetCode;

public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int temp;
            for(int i = 0; i < nums.length; i++){
                temp = nums[i];
                for(int j = i + 1; j < nums.length; j++){
                    if(temp + nums[j] == target){
                        return new int[] {i, j};
                        
                    }
                }
            }
            throw new IllegalArgumentException("No solution");
        }
    }
}
