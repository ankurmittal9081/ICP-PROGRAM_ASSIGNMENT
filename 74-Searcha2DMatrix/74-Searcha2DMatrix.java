// Last updated: 9/29/2025, 5:19:11 PM
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n=arr.length;
        int m=arr[0].length;
    
        return solve(arr,target,n,m);
    }
    public boolean  solve(int arr[][],int k,int n,int m){
        int l=0;
        int r=n*m-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==k){
                return true;
            }
            else if(arr[row][col]>k){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}