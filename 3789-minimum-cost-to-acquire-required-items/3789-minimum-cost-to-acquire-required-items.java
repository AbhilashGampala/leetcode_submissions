class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) 
    {
        long res1 = (long)need1*cost1 + (long)need2*cost2;
        long res2 = (long)(Math.max(need1,need2))*costBoth;
        long res3 = Integer.MAX_VALUE;
        if(need1>=need2)
        {
            res3 = (long)need2*costBoth+(long)(need1-need2)*cost1;
        }
        else
        {
            res3 = (long)need1*costBoth+(long)(need2-need1)*cost2;
        }
        return Math.min(res1,Math.min(res2,res3));    
    }
}