class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>Map=new HashMap<>();
        int res=0;
        for( char ch:s.toCharArray()){
           Map.put(ch,Map.getOrDefault(ch,0)+1);
                if (Map.get(ch)%2==0){
                    res+=2;
                }   
        }
        return (res==s.length())?res:res+1;
    
    }
}
