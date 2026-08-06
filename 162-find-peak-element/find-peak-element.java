class Solution {
    public int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length -  1;

        while(start < end){
            // mid = (low + high) / 2; formula for bst

            int mid = start + (end - start) /2;

            if(nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}