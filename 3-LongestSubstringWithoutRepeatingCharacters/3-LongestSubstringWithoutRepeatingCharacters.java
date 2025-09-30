// Last updated: 9/30/2025, 10:03:22 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int max=0;
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<n;i++){

            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);

            max=Math.max(max,i-l+1);
        

        }
        return max;
    }
}