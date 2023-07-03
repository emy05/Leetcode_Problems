class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> subString=new ArrayList<>();
        int largestLength=0;
        for(int right=0;right<s.length();right++){
            if(subString.contains(s.charAt(right))){
                int index=subString.indexOf(s.charAt(right));
                subString.remove(index);
                if(index>0){
                    subString.subList(0,index).clear();
                }
            }
                subString.add(s.charAt(right));
                largestLength=Math.max(largestLength,subString.size());
        
            }
        
        return largestLength;
    }
}