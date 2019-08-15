class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text2.length()+1][text1.length()+1];
        for(int i =1;i<=text2.length();i++){
            for(int j =1;j<=text1.length();j++){
                if(text1.charAt(j-1) == text2.charAt(i-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[text2.length()][text1.length()];
    }
}
