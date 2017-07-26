public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length()==0||wordDict.isEmpty()) return false;
        
        boolean[] result = new boolean[s.length()+1];
        result[0] = true;
        int max = 0;
        for(String str: wordDict) max = Math.max(max, str.length());
        
        for(int i=1;i<=s.length();i++){
            for(int j=i-1;j>=Math.max(i-max,0);j--){
               if(result[j] && wordDict.contains(s.substring(j, i))){
                    result[i] = true;
                    break;
                }
            }
        }
        
        return result[s.length()];
    }
}
