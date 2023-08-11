class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int a=nums.length;
        for (int i=0; i<a-2; i++){
            for (int j=i+1; j<a-1; j++){
                for (int k=j+1; k<a; k++){
                    if((nums[j]-nums[i]==diff) && (nums[k]-nums[j]==diff))
                        count++;
                }
            }
        }
        return count;
    }
}