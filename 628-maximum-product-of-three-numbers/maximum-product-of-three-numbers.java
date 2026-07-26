class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length; // checking the klengrh of arrayy

        // lets sorting the array !
        Arrays.sort(nums);
        // product of number from last 3 digit ------------->>
        int product1 = nums[n - 3] * nums[n - 2] * nums[ n - 1];
        //product of largetest number from the starting 3 numbers 
        int product2 = nums[0] * nums[1]  * nums[n - 1];
// now comapreing thee number result which one is the biggest one 
        if(product1 > product2){
            return product1;
        }else{
            return product2;
        }

        // return Math.max(product1, product2)
    }
}