class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longPrefix = "";
        HashMap<String,Integer> map = new HashMap<>();
        // get all possible prefix
        for(String s : strs){
            StringBuilder sb = new StringBuilder(s);
            for(int i=1;i<=sb.length();i++){
                String stemp = sb.substring(0,i);
                map.put(stemp,map.getOrDefault(stemp,0)+1);
            }
        }
        for(String key: map.keySet()){
            if(map.get(key)==strs.length){
                if(longPrefix.length()<key.length()){
                    longPrefix = key;
                }
            }
        }
        return longPrefix;
    }
}