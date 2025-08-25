class Solution {
    public int compress(char[] chars) {
        int i=0;
        int right=0;
        while(i<chars.length){
            char ch=chars[i];
            int count=0;
            while(i < chars.length && ch==chars[i]){
                count++;
                i++;

            }
            chars[right++]=ch;
            if(count>1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[right++]=c;
                }
            }
        }
        return right;

    }
}
