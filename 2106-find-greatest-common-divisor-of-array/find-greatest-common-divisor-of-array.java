class Solution {
    public int findGCD(int[] num) {
        int min = num[0];
        int max = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
        }
        // return num_min % num_max == 0;
        int gcd = 1;

        for(int i = 1; i <= min; i++){
            if(min % i == 0 && max % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}