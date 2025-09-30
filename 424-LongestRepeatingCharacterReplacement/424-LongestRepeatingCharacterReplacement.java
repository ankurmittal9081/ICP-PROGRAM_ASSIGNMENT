// Last updated: 9/30/2025, 10:34:53 PM
class Solution {
    public int characterReplacement(String s, int k) {
         int n=s.length();
        int l=0;
        int maxc=0;
        int maxl=0;
        int arr[]=new int[26];

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            arr[ch-'A']++;
            maxc=Math.max(maxc,arr[ch-'A']);
            if((i-l+1)-maxc>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxl=Math.max(maxl,i-l+1);
        }
        return maxl;
    }
}