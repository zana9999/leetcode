import java.util.*;

class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        
        if (grid[0][0] == 1 || grid[m-1][n-1] == 1){
            return 0;
        }

        int[][] memo = new int [m][n];
        for(int[] row: memo){
            Arrays.fill(row, -1);
        }

        return helper(grid, 0, 0, m , n, memo);

    }


    public int helper(int[][] grid, int i, int j, int m, int n, int [][] memo){
        if(i >= m || j >= n || grid[i][j] == 1){
            return 0;
        }

        if(i == m-1 && j == n-1){
            return 1;
        }

        if(memo[i][j] != -1){
            return memo[i][j];
        }

        memo[i][j]= helper(grid, i + 1, j, m , n, memo ) + helper(grid, i, j + 1, m , n , memo);
        return memo[i][j];
    }
}
