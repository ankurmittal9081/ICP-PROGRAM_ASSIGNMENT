// Last updated: 9/29/2025, 5:15:07 PM
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n=arr.length;
        int m=arr[0].length;
        
        int ans[]=new int[n*m];
        int p=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[p++]=arr[i][j];
            }
        }
    
        return solve(ans,target);
    }
    public boolean  solve(int arr[],int k){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==k){
                return true;
            }
            else if(arr[mid]>k){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}