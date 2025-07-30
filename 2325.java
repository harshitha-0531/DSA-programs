class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> Map=new HashMap<>();

        char curr='a';
        for (char ch:key.toCharArray()){
            if (Character.isLetter(ch)){
                if (!Map.containsKey(ch)){
                    Map.put(ch,curr);
                    curr++;
                }
            }
        }
        Map.put(' ',' ');
        String res="";
        for (char i:message.toCharArray()){
            res+=Map.get(i);
        }
        return res;
    }
}
