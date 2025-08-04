class Solution {
    public int maxDifference(String s) {
        HashMap <Character,Integer> Map=new HashMap<>();
        for(char ch:s.toCharArray()){
            Map.put(ch,Map.getOrDefault(ch,0)+1);
        }
        int odd_fre=0;
        int even_fre=Integer.MAX_VALUE;
        for(int i:Map.values()){
            if(i%2!=0){
                odd_fre=Math.max(odd_fre,i);
            }
            else{
                even_fre=Math.min(even_fre,i);
            }
        }
        if( even_fre==Integer.MAX_VALUE){
            even_fre=0;
        }
        return odd_fre-even_fre;

    }
}
