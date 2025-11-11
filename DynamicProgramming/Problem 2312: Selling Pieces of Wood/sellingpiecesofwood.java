class Solution {
    public long sellingWood(int m, int n, int[][] prices) {
        long[][] dp = new long[m+1][n+1];
        long[][] p = new long[m+1][n+1];

        for(int[] price : prices){
            int h = price[0];
            int w = price[1];
            int val = price[2];
            p[h][w] = val;
        }


        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                
                long horizontalMax = 0;
                long verticalMax = 0;
                long maxProfit = p[i][j];

                for(int t = 1; t < i; t++){
                    horizontalMax = Math.max(horizontalMax, dp[t][j] + dp[i-t][j]);
                }

                for(int t = 1; t < j; t++){
                    verticalMax = Math.max(verticalMax, dp[i][t] + dp[i][j-t]);
                }

                dp[i][j] = Math.max(maxProfit, Math.max(horizontalMax, verticalMax));

            }
        }

        return dp[m][n];
        
    }
}
