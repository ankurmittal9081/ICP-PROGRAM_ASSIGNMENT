// Last updated: 10/6/2025, 10:07:24 PM
class Solution {
    public int evalRPN(String[] s) {
        Stack<Integer> st=new Stack<>();
        for(String i:s){
                if(i.equals("+")){
                    st.push(st.pop()+st.pop());
                }
                else if(i.equals("-")){
                    int b=st.pop();
                    int a=st.pop();
                    st.push(a-b);
                }
                else if(i.equals("*")){
                    st.push(st.pop()*st.pop());
                }
                else if(i.equals("/")){
                    int b=st.pop();
                    int a=st.pop();
                    st.push(a/b);     
                }
                else{
                    st.push(Integer.parseInt(i));
                }
                
        }
        return st.pop();



    }
}