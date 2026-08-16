class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> charInd = new HashMap<>();
        int maxLen = 0, left = 0;
        boolean found = false;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            charInd.put(c, charInd.getOrDefault(c, 0) + 1);
            while (charInd.get(c) > 2) {
                char d = s.charAt(left);
                charInd.put(d, charInd.get(d) - 1);
                left++;
            }
            int current = right - left + 1;
            maxLen = Math.max(maxLen, current);
        }
        return maxLen;
    }
}