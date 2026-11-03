class Solution {

     public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(String word : strs){
            sb.append(word.length());
            sb.append(",");
        }
        sb.append("#");
        for(String word : strs){
            sb.append(word);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals("#"))
            return new ArrayList<>();
       var splitString = str.split(",#");
       var lenghts = Arrays.stream(splitString[0].split(",")).map(x->Integer.parseInt(x)).toList();
       List<String> decodedString = new ArrayList<>();
       int beginningIndex = 0;
       for(int lenght : lenghts){
           if(lenght==0){
               decodedString.add("");
               continue;
           }
           int endIndex=beginningIndex+lenght;
           decodedString.add(splitString[1].substring(beginningIndex,endIndex));
           beginningIndex=endIndex;
       }
       return decodedString;
    }
}
