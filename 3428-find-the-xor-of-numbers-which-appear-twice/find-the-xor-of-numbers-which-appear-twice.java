class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num, 0)+ 1);
        }
            int ans = 0;
            for(Map.Entry<Integer,  Integer> entry : map.entrySet()){
                int number = entry.getKey();
                int freq = entry.getValue();

            if (freq == 2){
                ans ^= number;
            }
            
        }
            return ans;
}
}