class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0,j=0;
        int maxLength = 0;
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
            }else{
                set.add(s.charAt(j));
                maxLength = Math.max(maxLength,j-i+1);
                j++;
            }

        }
        return maxLength;
    }
}
