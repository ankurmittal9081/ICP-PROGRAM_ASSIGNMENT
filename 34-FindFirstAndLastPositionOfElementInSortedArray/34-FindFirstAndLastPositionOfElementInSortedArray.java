// Last updated: 9/27/2025, 5:19:24 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
        
    }
    public static int first(int arr[],int t){
        int n=arr.length;
        int l=0;
        int ans=-1;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==t){
                ans=mid;
                r=mid-1;
            }
            else if(arr[mid]<t){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return ans;
    }
    public static int last(int arr[],int t){
        int n=arr.length;
        int l=0;
        int ans=-1;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==t){
                ans=mid;
                l=mid+1;
            }
            else if(arr[mid]<t){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return ans;
    }
}