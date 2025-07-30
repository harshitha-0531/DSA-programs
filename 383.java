class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> Map=new HashMap<>();
        
        for (char ch:magazine.toCharArray()){
            if(Map.containsKey(ch)) Map.put(ch,Map.get(ch)+1);
            else Map.put(ch,1); 
        }
        for(char i:ransomNote.toCharArray()){
            if(!Map.containsKey(i)||Map.get(i)==0) return false;
            else Map.put(i, Map.get(i)-1);  
        }
        return true;
    }
}
