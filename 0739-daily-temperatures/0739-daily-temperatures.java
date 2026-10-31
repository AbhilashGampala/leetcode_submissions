class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&t[st.peek()]<=t[i]) st.pop();
            if(st.isEmpty()) ans[i]=i;
            else ans[i]=st.peek();
            st.push(i);
        }
        for(int i=0;i<n;i++){
            ans[i]=ans[i]-i;
        }
        return ans;
    }
}