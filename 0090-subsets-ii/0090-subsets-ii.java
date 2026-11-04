class Solution {
    public int getKthBit(int n,int k){
        return ((n&(1<<k))==0)?0:1;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<(1<<n);i++){
            List<Integer> l=new ArrayList<>();
            for(int k=0;k<n;k++){
                if(getKthBit(i,k)==1) l.add(nums[k]);
            }
            Collections.sort(l);
            set.add(l);
        }
        List<List<Integer>> li=new ArrayList<>(set);
        return li;
    }
}