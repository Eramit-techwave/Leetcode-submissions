class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int right = 0;
        // int left = nums.length
        int point1 = m - 1; // store the last vaild number
        int point2 = n - 1; // sotre the last number
        int p = m + n - 1; //space of num 1

        // loops
        while(point1  >= 0 && point2 >= 0){
            if(nums1[point1] > nums2[point2]){
                nums1[p] = nums1[point1];
                point1 --; // reverse the pointer num1
            }else{
                nums1[p] = nums2[point2];
                point2 --;
            }
            p--;
        }

        while(point2 >= 0){
            nums1[p] = nums2[point2];
            point2--;
            p--;
        }


    }
}