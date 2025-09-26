// Last updated: 9/26/2025, 7:38:32 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {

            int c=target-nums[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}