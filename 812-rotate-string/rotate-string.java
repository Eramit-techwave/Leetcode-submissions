class Solution {
    public boolean rotateString(String s, String goal) {
        // checking the complete  length of the both the string if they were not are become the goal after rotating we should have to return false
        if(s.length()!= goal.length()){
            return false;
        }
        String doubledString = (s +  s);

        return doubledString.contains(goal);
    }
}