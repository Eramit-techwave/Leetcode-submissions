class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length(); 
        char[] arr = s.toCharArray(); // String ko character array me convert kiya
        int[] count = new int[26];    // Correct Java array declaration
        
        // Left half ke characters count karein
        for(int i = 0; i < n / 2; i++){
            count[arr[i] - 'a']++; 
        }
        
        // Left half ko alphabetical order me overwrite karein
        int index = 0;
        for(int i = 0; i < 26; i++){
            while(count[i]-- > 0){
                arr[index++] = (char)(i + 'a');
            }
        }
        
        // Left half ko right half par mirror kar dein
        for(int i = 0; i < n / 2; i++){
            arr[n - 1 - i] = arr[i];
        }
        
        // Char array ko wapas String banakar return karein
        return new String(arr); 
    }
}