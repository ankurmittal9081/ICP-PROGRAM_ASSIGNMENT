// Last updated: 10/3/2025, 9:24:23 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                   boolean ans= solve(board,word,i,j,n,m,0);
                   if(ans) return true;

                }
            }
        }
        return false;
    }

    public static boolean solve(char arr[][],String s,int cr,int cc,int er,int ec,int i){
        if(i==s.length()) return true;
        if(cr<0 || cc<0||cc>=ec|| cr>=er) return false;
        if(arr[cr][cc]=='#') return false;
        char ch=s.charAt(i);
        if(arr[cr][cc]==ch){
            
            arr[cr][cc]='#';
        boolean found=solve(arr,s,cr-1,cc,er,ec,i+1)||
        solve(arr,s,cr+1,cc,er,ec,i+1)||
        solve(arr,s,cr,cc-1,er,ec,i+1)||
        solve(arr,s,cr,cc+1,er,ec,i+1);

        arr[cr][cc]=ch;
        return found;
        }
        return false;
    }
}