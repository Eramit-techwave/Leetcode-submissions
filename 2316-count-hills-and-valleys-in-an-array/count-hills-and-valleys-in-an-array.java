class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int left = nums[0]; 
        
        for (int i = 1; i < nums.length - 1; i++) {
            // Check if current forms a hill or a valley with the left neighbor and the right neighbor
            if ((left < nums[i] && nums[i] > nums[i + 1]) || (left > nums[i] && nums[i] < nums[i + 1])) {
                count++;
                // Update the left neighbor to the current element once a hill or valley is found
                left = nums[i]; 
            }
        }
        
        return count;
    }
}