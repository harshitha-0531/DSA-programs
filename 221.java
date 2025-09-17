class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
        int maxi=0;
        for(int i=0;i<m;i++){
            dp[i][0]=matrix[i][0]-'0';
            maxi=Math.max(maxi,dp[i][0]);
        }
        for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j] -'0';
            maxi=Math.max(maxi,dp[0][j]);
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if (matrix[i][j]=='1'){
                    int left=dp[i][j-1];
                    int top=dp[i-1][j];
                    int dia=dp[i-1][j-1];
                    dp[i][j]=Math.min(left,Math.min(top,dia))+1;
                    maxi=Math.max(maxi,dp[i][j]);
                }
            }
        }
        return maxi*maxi;

    }
}
