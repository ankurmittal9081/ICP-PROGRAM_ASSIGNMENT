// Last updated: 10/4/2025, 9:46:37 PM
class Solution {
    public int rob(int[] nums) {
        int a=0;
        int b=0;
        for(int i:nums){
            int temp=a;
            a=Math.max(a,b+i);
            b=temp;
        }
        return a;
    }
}