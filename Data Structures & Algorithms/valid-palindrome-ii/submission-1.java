class Solution {
    public boolean validPalindrome(String s) {
        int allowed =1;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)) {
                i++;j--;
            }else{
                int tempi=i;int tempj=j;
                tempi++;
                while(tempi<tempj){
                    if(s.charAt(tempi)==s.charAt(tempj)) {
                        tempi++;tempj--;
                    }
                    else
                        break;
                }
                if(tempi<tempj){
                    tempi=i;tempj=j-1;
                    while(tempi<tempj){
                        if(s.charAt(tempi)==s.charAt(tempj)) {
                            tempi++;tempj--;
                        }
                        else
                            break;
                    }
                }
                if(tempi<tempj)
                    return false;
                else
                    return true;
            }

        }
        return true;
    }
}