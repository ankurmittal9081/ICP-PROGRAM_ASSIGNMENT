// Last updated: 9/30/2025, 10:40:09 PM
class Solution 
{
    public int longestOnes(int[] nums, int k)
     {
        int l=0;
        int maxl=0;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) z++;
        while(z>k){
            if(nums[l]==0)z--;
            l++;
        }
        maxl=Math.max(maxl,i-l+1);
        }

    return maxl;
    }
}