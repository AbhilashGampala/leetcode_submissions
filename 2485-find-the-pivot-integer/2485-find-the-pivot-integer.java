class Solution {
    public int pivotInteger(int n) {
        int  t=(n+1)*n/2;
        int k=(int) Math.sqrt(t);
        if(k*k==t) return k;
        return -1;
    }
}