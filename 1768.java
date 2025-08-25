class Solution {
    public String mergeAlternately(String word1, String word2) {
        // int n=Math.min(word1.length(),word2.length());
        String res="";
        int i=0;int j=0;
        while( i<word1.length() && j<word2.length()){
        // for(int i=0;i<n;i++){
            res= res + word1.charAt(i++);
            res= res+word2.charAt(j++);
        }
        while(word1.length()>i){
            res+=word1.charAt(i++);
        }
        while(word2.length()>j){
            res+=word2.charAt(j++);
        }
        return res;
        
    }
}
