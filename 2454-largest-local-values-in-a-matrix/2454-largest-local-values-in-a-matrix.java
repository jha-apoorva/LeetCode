class Solution {
    public int findMax(int[][] grid,int x,int y){
        int max = Integer.MIN_VALUE;
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                max = Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                maxLocal[i][j] = findMax(grid,i,j);
            }
        }
    return maxLocal;
    }
}