class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int row=s1.length();
        int col=s2.length();
        if (row + col!=s3.length())return false;

       
        boolean dp[][]=new boolean [row+1][col+1];
         dp[0][0]=true;
        /*for(int i=1;i<=row;i++){
            if( s1.charAt(i-1)==s3.charAt(i-1)){
                dp[i][0]=dp[i-1][0];
            }
        }
        for(int j=1;j<=col;j++){
            if(s2.charAt(j-1)==s3.charAt(j-1)){
                dp[0][j]=dp[0][j-1];
            }
        }*/
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                if( (j>0) && (dp[i][j-1]) && (s2.charAt(j-1)==s3.charAt(i+j-1))){
                 dp[i][j]=true;
                }
                if( (i>0) && (dp[i-1][j]) && (s1.charAt(i-1)==s3.charAt(i+j-1))){
                 dp[i][j]=true;
                }
            }
        } 
        return dp[row][col];
    }      
}
