class Solution {
    public boolean isPalindrome(String s) {
        String sq = s.codePoints().mapToObj(x -> (char)x).filter(x -> (x>='a' && x<='z')|| (x>='A' && x<='Z') || (x>='0' && x<='9')).map(x->Character.toLowerCase(x)).map(Object::toString).collect(Collectors.joining());
        int i=0,j=sq.length()-1;
        while(i<j){
            if(sq.charAt(i)!=sq.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }
}
