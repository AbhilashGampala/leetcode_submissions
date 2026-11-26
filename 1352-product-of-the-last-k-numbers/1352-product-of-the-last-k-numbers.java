class ProductOfNumbers {
    List<Integer> li;    List<Integer> pre;
    public ProductOfNumbers() {
        pre=new ArrayList<>();
        pre.add(1);
    }
    public void add(int num) {
        if(num==0){
            pre.clear();
            pre.add(1);
        }
        else {
            int last=pre.get(pre.size()-1);
            pre.add(last*num);
        }
    }
    
    public int getProduct(int k) {
        int n=pre.size();
        if(k>=n) return 0;
        return pre.get(n-1)/pre.get(n-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */