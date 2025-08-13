class Solution {
    public String decodeString(String s) {
        Stack <String> stk=new Stack<>();
       
        for (char ch:s.toCharArray()){
            if (ch!=']'){
                stk.push(String.valueOf(ch));
            }else{
               String s1="";
                while(!stk.isEmpty() && !stk.peek().equals("[")){
                    s1 =stk.pop()+s1;
                }
                if(!stk.isEmpty())  stk.pop();
                String n="";
                while(!stk.isEmpty() && stk.peek().matches("\\d")){
                    n=stk.pop()+n;  
                }
                int num=Integer.parseInt(n);
                String res="";
                for(int i=0;i<num;i++){
                    res+=s1;
                }
                stk.push(res);
            }
        }
        String dec="";
        for(String str:stk){
            dec+=str;
        }    
        return dec;
    }
}
