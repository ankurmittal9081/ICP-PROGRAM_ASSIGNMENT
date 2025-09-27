// Last updated: 9/27/2025, 9:19:22 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        int st=0;
        int e=10;
        while(e<=s.length()){
            String str=s.substring(st,e);
            if(set.contains(str)){
                if(!res.contains(str))
                    res.add(str);
            }
            else{
                set.add(str);
            }
            st++;
            e++;
        }
        return res;

        
    }
}