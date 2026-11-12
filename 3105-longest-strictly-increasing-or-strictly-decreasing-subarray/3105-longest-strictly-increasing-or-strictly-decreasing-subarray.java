class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int ans=1;
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]) count++;
            else count=0;
            ans=Math.max(count+1,ans);
        }
        count=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]) count++;
            else count=0;
            ans=Math.max(count+1,ans);
        }
        return ans;
    }
}