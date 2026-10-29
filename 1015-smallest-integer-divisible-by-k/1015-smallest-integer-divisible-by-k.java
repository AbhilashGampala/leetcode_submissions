class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0||k%5==0) return -1;
        if(k==1) return 1;
        long a=0;
        for(int i=1;i<=k;i++){
            a=(a*10+1)%k;
            // System.out.println(a);
            if(a==0) return i;
        }
        return -1;
    }
}