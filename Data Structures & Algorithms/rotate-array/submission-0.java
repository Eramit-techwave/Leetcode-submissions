class Solution {
    public void rotate(int[] num, int k) {
        int n = num.length;
        k = k % n;
        rev (num, 0, n-1);
        rev(num , 0, k-1);
        rev(num , k , n-1);

    }
    private void rev(int[]  num , int start, int end){
        while (start < end){
            int temp = num[start];
            num [start] = num[end];
            num [end] = temp;
            start ++;
            end --;
        }
    }
}