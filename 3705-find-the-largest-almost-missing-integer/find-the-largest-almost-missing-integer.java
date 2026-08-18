class Solution {
    public int largestInteger(int[] nums, int k) {
        // Map to store how many subarrays of size k contain each number
        Map<Integer, Integer> subarrayCount = new HashMap<>();
        int n = nums.length;
        
        // 1. Loop through all starting positions of subarrays of size k
        for (int i = 0; i <= n - k; i++) {
            
            // Use a Set to track numbers present in the CURRENT subarray
            Set<Integer> seenInCurrentSubarray = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                seenInCurrentSubarray.add(nums[j]);
            }
            
            // Increment the count for each unique number found in this subarray
            for (int num : seenInCurrentSubarray) {
                subarrayCount.put(num, subarrayCount.getOrDefault(num, 0) + 1);
            }
        }
        
        int ans = -1;
        
        // 2. Find the largest number that appeared in EXACTLY 1 subarray
        for (Map.Entry<Integer, Integer> entry : subarrayCount.entrySet()) {
            if (entry.getValue() == 1) {
                ans = Math.max(ans, entry.getKey());
            }
        }
        
        return ans;
    }
}