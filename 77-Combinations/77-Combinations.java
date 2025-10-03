// Last updated: 10/3/2025, 9:31:42 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>l= new ArrayList<>();
        solve(1,n,k,new ArrayList<>(),l);
        return l;

    }

    public static void solve(int st,int n,int k,ArrayList<Integer> ll,List<List<Integer>>l){
        if(ll.size()==k){
            l.add(new ArrayList<>(ll));
            return ;
        }

        for(int i=st;i<=n;i++){
            ll.add(i);
            solve(i+1,n,k,ll,l);
            ll.remove(ll.size()-1);
        }


    }
}