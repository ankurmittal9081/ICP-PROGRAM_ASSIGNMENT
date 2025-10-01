class Solution {
    public int eraseOverlapIntervals(int[][] points) {
         int n=points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int prev[]=points[0];
        int c=1;
        for(int i=1;i<n;i++){
            int currsp=points[i][0];
            int currep=points[i][1];
            int prevsp=prev[0];
            int prevep=prev[1];

            if(currsp>=prevep){
                prev=points[i];
                c++;
            }
            else{
                prev[0]=Math.max(prevsp,currsp);
                prev[1]=Math.min(prevep,currep);
            }
        }
        return n-c;
    }
}
