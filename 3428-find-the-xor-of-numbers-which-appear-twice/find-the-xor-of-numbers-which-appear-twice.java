class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
// hamko isme hashmap use kr k value ko find krna hai ye pura xor nahi solve kr payega

        for (int num : nums) {
            // ek ek kr k array ko travse krega 
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // sare values ko dekhna padega  vo kaise hai en
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int freq = entry.getValue();
// nikale huye value ko dekhega vo kaise hai or unka oxr find kr k rakhega
            if (freq == 2) {
                ans ^= number;
            }

        }
        return ans;
    }
}