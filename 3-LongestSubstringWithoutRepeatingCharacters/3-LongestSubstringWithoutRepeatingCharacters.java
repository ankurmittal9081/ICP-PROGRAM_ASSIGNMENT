// Last updated: 9/27/2025, 9:19:34 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int[] count = new int[256];  // ASCII character set size

        while (end < s.length()) {
            if (count[s.charAt(end)] == 0) {
                count[s.charAt(end)]++;
                ans = Math.max(ans, end - start + 1);
                end++;
            } else {
                count[s.charAt(start)]--;
                start++;
            }
        }
        return ans;
    }
}
