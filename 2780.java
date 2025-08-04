class Solution {
    public int minimumIndex(List<Integer> nums) {
        // int n=nums.size();
        HashMap<Integer,Integer> leftMap=new HashMap<>();
        HashMap<Integer,Integer> rightMap=new HashMap<>();
        for (int i:nums){
            rightMap.put(i,rightMap.getOrDefault(i,0)+1);
        }
    int size=nums.size();
        for(int i=0;i<size-1;i++){
            int n=nums.get(i);
            leftMap.put(n,leftMap.getOrDefault(n,0)+1);
            rightMap.put(n,rightMap.get(n)-1);
           if( (leftMap.get(n)*2>(i+1))&&( rightMap.get(n)*2>(size-1-i))) return i;
            
        }

       return -1; 
    }
}
