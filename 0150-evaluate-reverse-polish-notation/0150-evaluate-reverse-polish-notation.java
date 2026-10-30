class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if(s.equals("+")) {
                String a=st.pop();
                String b=st.pop();
                int ans=Integer.parseInt(a)+Integer.parseInt(b);
                st.push(Integer.toString(ans));
            }
            else if(s.equals("-")) {
                String a=st.pop();
                String b=st.pop();
                int ans=Integer.parseInt(b)-Integer.parseInt(a);
                st.push(Integer.toString(ans));
            }
            else if(s.equals("*")) {
                String a=st.pop();
                String b=st.pop();
                int ans=Integer.parseInt(a)*Integer.parseInt(b);
                st.push(Integer.toString(ans));
            }
            else if(s.equals("/")) {
                String a=st.pop();
                String b=st.pop();
                int ans=Integer.parseInt(b)/Integer.parseInt(a);
                st.push(Integer.toString(ans));
            }
            else st.push(s);
        }
        return Integer.parseInt(st.pop());
    }
}