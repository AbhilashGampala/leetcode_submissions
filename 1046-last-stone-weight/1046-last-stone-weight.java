class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y) pq.add(Math.abs(x-y));
            for(int i:pq){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        if(pq.size()==1) return pq.poll();
        return 0;
    }
}