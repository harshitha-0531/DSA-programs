class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        List<String>op= Arrays.asList("+","-","*","/");
        for(String s:tokens){
            if (!op.contains(s)){
              stk.push(Integer.parseInt(s));  
            }
            else{
                int b=stk.pop();
                int a=stk.pop();
                int res=0;
                switch(s){
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        res = a / b;
                        break;
                }
                stk.push(res);
            }
        }
        return stk.pop();      
    }
}
