class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        boolean ans=false;
        long sum=0;
        for(long i:target){
            pq.add(i);
            sum+=i;
        }
        while(!pq.isEmpty()){
            long l=pq.poll();
            long rem=sum-l;
            if(rem==1||l==1) return true;
            if(rem==0||l<=rem) return false;
            long prev=l%rem;
            if(prev==0) return false;
            sum=rem+prev;
            pq.add(prev);
        }
        for(long i:pq){
            if(i!=1) return false;
        }
        return true;
    }
}