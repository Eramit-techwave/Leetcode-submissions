class Solution {
    public boolean isAnagram(String s, String t) {
        // checking the length of the string if the length is not smae eturn false
        if(s.length() != t.length()){
            return false;
        }
        int[] fre = new int[26]; // converting all of them into a charcteer
        // checking the length with s string and incresing the count of the string length
        for(int i  =0; i< s.length(); i++){
            fre[s.charAt(i) - 'a'] ++;
        }
// second loop for the second t string length and decresing the length;
        for(int i =0; i <t.length();i++){
            fre[t.charAt(i) - 'a']--;
        }

        for(int count : fre){
            if(count != 0){
               return false;
            }

        }
        return true;
    }
}