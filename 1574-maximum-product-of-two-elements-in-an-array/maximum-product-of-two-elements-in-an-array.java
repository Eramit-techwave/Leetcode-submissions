class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int pr1 = ((nums[n - 2]-1 ) * (nums[n-1]- 1));
        int pr2 = ((nums[0] - 1) * (nums[1] - 1));

        if(pr1> pr2){
            return pr1;
        }else{
            return pr2;
        }
    }
}
