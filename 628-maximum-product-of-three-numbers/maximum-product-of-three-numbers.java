class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length; // checking the klengrh of arrayy
        Arrays.sort(nums);

        int product1 = nums[n - 3] * nums[n - 2] * nums[ n - 1];
        int product2 = nums[0] * nums[1]  * nums[n - 1];

        if(product1 > product2){
            return product1;
        }else{
            return product2;
        }

        // return Math.max(product1, product2)
    }
}