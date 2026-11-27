class Solution {
    HashMap<Character,Integer> map=new HashMap<>();
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n=parent.length;
        ArrayList<Integer>[] adj=new ArrayList[n];
        for(int i=0;i<n;i++) adj[i]=new ArrayList<>();
        for(int i=1;i<n;i++) adj[parent[i]].add(i);


        modify(adj,parent,s,0);
        
        ArrayList<Integer>[] ad=new ArrayList[n];
        for(int i=0;i<n;i++) ad[i]=new ArrayList<>();
        for(int i=1;i<n;i++) ad[parent[i]].add(i);
        int[] ans=new int[n];

        ans[0]=dfs(ad,ans,0);
        return ans;
    }
    public int dfs(ArrayList<Integer>[] ad,int[] ans,int i){
        int size=1;
        for(int j:ad[i]){
            size+=dfs(ad,ans,j);
        }
        return ans[i]=size;
    }
    public void modify(ArrayList<Integer>[] adj,int[] parent,String s,int i){
        char ch=s.charAt(i);
        Integer old=map.get(ch);
        if(old!=null){
            parent[i]=old;
        }
        map.put(ch,i);
        for(int j:adj[i]){
            modify(adj,parent,s,j);
        }

        if(old==null) map.remove(ch);
        else map.put(ch,old);
    }

}