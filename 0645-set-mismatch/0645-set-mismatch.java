class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2];
        int[] frq=new int[n+1];
        for(int i=0;i<n;i++){
            frq[nums[i]]++;
        }
        for(int i=0;i<=n;i++){
            if(frq[i]==0) ans[1]=i;
            else if(frq[i]==2) ans[0]=i;
        }
        return ans;
    }
}