class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> Map=new HashMap<>();
        int res=0;
        for (int ch:nums){
            Map.put(ch,Map.getOrDefault(ch,0)+1);
        }
        List<Integer> Keys=new ArrayList<>(Map.keySet());
        Collections.sort(Keys);
        for(int i=1;i<Keys.size();i++){
            if((Keys.get(i)-Keys.get(i-1))==1){
                res=Math.max(res,Map.get(Keys.get(i))+ Map.get(Keys.get(i-1)));
            }
        }
        return res;
    }
}
