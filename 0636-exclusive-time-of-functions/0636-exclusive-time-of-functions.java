class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        int prevTime=0;
        for(String s:logs){
            String[] a=s.split(":");
            int f=Integer.parseInt(a[0]);
            int t=Integer.parseInt(a[2]);
            if(a[1].equals("start")){
                if(!st.isEmpty()) 
                    ans[st.peek()]+=t-prevTime;
                st.push(f);
                prevTime=t;
            }
            else {
                ans[st.peek()] += t - prevTime + 1;

                st.pop();
                prevTime = t + 1;
            }
        }
        return ans;
    }
}