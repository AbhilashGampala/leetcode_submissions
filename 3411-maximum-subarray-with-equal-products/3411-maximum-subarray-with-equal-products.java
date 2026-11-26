class Solution {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int lcm(int a,int b){
        return (a / gcd(a, b)) * b;
    }
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int prod=1;
            int gcd=0;
            int lcm=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                gcd=gcd(gcd,nums[j]);
                lcm=lcm(lcm,nums[j]);
                if(prod==lcm*gcd) ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}