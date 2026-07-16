class Solution {
    // public long gcdSum(int[] nums) {
        private int getGcd(int a, int b){
            if(b == 0){
                return a;
            }
        return getGcd(b, a%b);
        }
        public long gcdSum(int[] nums){
        int n = nums.length;
        int[] prefixed = new int[n];

        int currentMax = 0;

        for(int i = 0; i < n; i++){
            currentMax = Math.max(currentMax, nums[i]);
            prefixed[i] = getGcd(nums[i], currentMax);
        }
        Arrays.sort(prefixed);

        long finalSum = 0;
        int left =0;
        int right = n - 1;

        while(left < right){
            finalSum += getGcd(prefixed[left], prefixed[right]);

            left++;
            right--;
        }
            return finalSum;
        }
    }
