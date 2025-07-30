class Solution {
    public int findLucky(int[] arr) {
        HashMap <Integer,Integer> Map= new HashMap<>();
        for ( int ch:arr){
            Map.put(ch,Map.getOrDefault(ch,0)+1);
        }
        int luck=-1;
        for(int i:Map.keySet()){
            if(i==Map.get(i)){
                luck=Math.max(luck,i);
            }
        }
        return luck;

    }
}
