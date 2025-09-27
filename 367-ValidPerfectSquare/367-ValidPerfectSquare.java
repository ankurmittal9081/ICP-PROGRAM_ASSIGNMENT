// Last updated: 9/27/2025, 9:43:11 PM
class Solution {
    public boolean isPerfectSquare(int n) {
        long l=1;
        long h=n;
        while(l<=h){
            long mid=l+(h-l)/2;
            long sq=mid*mid;
            if(sq==n){
                return true;
            }
            else if(sq>n){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}