class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.trim().substring(s.trim().lastIndexOf(" ") + 1).length();

        return length;
    }
}