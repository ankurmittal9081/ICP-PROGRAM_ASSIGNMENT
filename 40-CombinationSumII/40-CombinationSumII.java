// Last updated: 10/3/2025, 9:43:54 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>l= new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,0,new ArrayList<>(),l);
        return l;

    }

    public void solve(int arr[],int target,int st,ArrayList<Integer>ll,List<List<Integer>>l){
        if(target==0){
            l.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=st;i<arr.length;i++){
            if(i>st&&arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ll.add(arr[i]);
            solve(arr,target-arr[i],i+1,ll,l);
            ll.remove(ll.size()-1);
        }
    }
}