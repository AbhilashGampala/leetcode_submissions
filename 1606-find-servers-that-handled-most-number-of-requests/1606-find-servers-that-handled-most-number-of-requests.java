class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.y,b.y));
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<k;i++){
            ts.add(i);
        }
        int[] freq=new int[k];
        for(int i=0;i<arrival.length;i++){
            while(!pq.isEmpty()&&pq.peek().y<=arrival[i]){
                ts.add(pq.poll().x);
            }
            if(ts.isEmpty()) continue;

            int server=(i%k);
            Integer next=ts.ceiling(server);
            if(next==null) next=ts.first();
            freq[next]++;
            ts.remove(next);
            pq.add(new Pair(next,arrival[i]+load[i]));
        }
        int max=Integer.MIN_VALUE;
        for(int i:freq){
            max=Math.max(max,i);
        }
        for(int i=0;i<k;i++){
            if(max==freq[i]) ans.add(i);
        }
        return ans;
    }
}