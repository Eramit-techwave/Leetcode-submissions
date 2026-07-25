class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int counting = 0;

        for(int num: nums){
    count = (count^num)& ~counting;
    counting = (counting ^num) & ~count;
}        
        return count;
    }
}