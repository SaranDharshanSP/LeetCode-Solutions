class Solution {
   public int firstMissingPositive(int[] nums) {
         Arrays.sort(nums);
         int expected=1;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==expected & nums[i]>0){
                    expected++;
            }
            }
             return expected;
}}