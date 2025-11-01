class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder result = new StringBuilder();
        // One pointer approach
        for(int i=0;i<n || i<m; i++){
            if(i<n){
                result.append(word1.charAt(i));
            }
            if(i<m){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
        
    }
}