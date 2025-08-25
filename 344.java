class Solution {
    public static void reverseString(char[] s) {
        int left=0; 
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++; 
            right--;
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
     String  str=sc.nextLine().trim();
     char s[]=str.toCharArray();
     reverseString(s);
     System.out.println( new String(s));
    }
}
