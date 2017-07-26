public class Solution {
    public int minCost(int[][] costs) {
        if(costs.length==0) return 0;
        int[][] dp = new int[costs.length][costs[0].length];
        for(int j=0;j<3;j++){
            dp[0][j] = costs[0][j];
        }        
        for(int i=1;i<costs.length;i++){
            for(int j=0;j<3;j++){
                dp[i][j] = Math.min(dp[i-1][(j+1)%3]+costs[i][j], dp[i-1][(j+2)%3]+costs[i][j]);
            }
        }
        return Math.min(Math.min(dp[costs.length-1][0],dp[costs.length-1][1]),dp[costs.length-1][2]);
    }
}
