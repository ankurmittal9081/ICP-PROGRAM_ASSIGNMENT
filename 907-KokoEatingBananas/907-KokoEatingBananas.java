// Last updated: 9/27/2025, 5:19:19 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;  
        int end = 0;
        for (int pile : piles) {
            end = Math.max(end, pile); 
        }
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            int totalHours = 0;
            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid;  
            }
            
            if (totalHours > h) {
                start = mid + 1;  
            } else {
                end = mid;  
            }
        }
        
        return start;  
    }
}
