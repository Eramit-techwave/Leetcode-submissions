class Solution {
    public int maxSubArray(int[] nums) {
       int Max_sum = nums[0];
        int curr_sum = 0;

        for(int i = 0; i <nums.length; i ++) {
            curr_sum = curr_sum + nums[i];
            if(curr_sum > Max_sum){
                Max_sum = curr_sum;
            }
            if(curr_sum <0){
                curr_sum = 0;
            }
        }
        return Max_sum;
    }
}