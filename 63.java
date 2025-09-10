class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int col=obstacleGrid[0].length;
      int row=obstacleGrid.length;
      int [][]arr=new int[row][col];
      if (obstacleGrid[0][0] == 1) return 0;
        arr[0][0] = 1;
      for(int j=1;j<col;j++){
         if((obstacleGrid[0][j]==1)|| (arr[0][j-1] ==0 )){
            arr[0][j]=0;
         }else{
            arr[0][j]=1;
         }
      }
      for (int i=1;i<row;i++){
          if((obstacleGrid[i][0]==1)|| (arr[i-1][0] ==0 )){
            arr[i][0]=0;
         }else{
            arr[i][0]=1;
         }
      }
    for (int i=1;i<row;i++){
        for(int j=1;j<col;j++){
            if (obstacleGrid[i][j]==1){
                arr[i][j]=0;
            }else{
            arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
    }  
     return arr[row-1][col-1];
    }
}
