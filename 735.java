class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();
        for(int i:asteroids){
            boolean des=false;
            while(!stk.isEmpty() && i <0 && stk.peek()>0){
                if( stk.peek()== Math.abs(i)){
                    stk.pop(); 
                    des=true;
                    break;
                }
                else if (stk.peek() < Math.abs(i)){
                    stk.pop();
                    continue;
                }
                else {
                    des = true;
                    break;
                }
            }
            if (!des) stk.push(i); 
        }
        int[] result = new int[stk.size()];
        for (int i = stk.size() - 1; i >= 0; i--) {
            result[i] = stk.pop();
        }
        return result;
    }
}
