class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        boolean ans=false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                ans=true;
            }
            if(ans&&s.charAt(i)=='a') return false;
        }
        return true;
    }
}