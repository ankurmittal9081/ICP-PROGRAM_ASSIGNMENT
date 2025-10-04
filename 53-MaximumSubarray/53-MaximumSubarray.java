// Last updated: 10/4/2025, 9:49:14 PM
class Solution {
    public int maxSubArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0) sum=0;

        }
        return max;
    }
}