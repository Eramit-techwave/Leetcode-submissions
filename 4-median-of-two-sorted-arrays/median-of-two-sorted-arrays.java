class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[] = new int[nums1.length + nums2.length];
        int index  =0;
        for (int i = 0; i <  nums1.length; i++){
            nums3[index] = nums1[i];
            index++;
        }

        for(int i  = 0; i < nums2.length; i++){
            nums3[index] =nums2[i];
            index ++;
        }
        // int nums = nums.length();
        Arrays.sort(nums3);
        double median = 0;

        if( nums3.length % 2 != 0 ){
          
         int mid = nums3.length / 2;
          median = nums3[mid];
        }else{
             int mid = nums3.length / 2;
             median = (nums3[mid  - 1 ] + nums3 [mid] ) /2.00;
        }
return median;

    }
}