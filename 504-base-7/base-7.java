class Solution {
    public String convertToBase7(int num) {
        if (num == 0){
            return "0";
        }
        boolean negative = (num < 0);
        num = Math.abs(num);

        StringBuilder a = new StringBuilder();

        while (num >  0){
           int rem = num % 7;
            a.append(rem);
            num = num / 7;
        }
        if(negative){
            a.append("-");
        }
       return a.reverse().toString();
    }
}