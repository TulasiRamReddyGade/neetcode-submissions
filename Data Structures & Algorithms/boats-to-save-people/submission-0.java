class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1,count=0;
        while(i<=j){
            if(i==j){
                count++;
                i++;j--;
                break;
            }
            if(people[j]+people[i]>limit){
                j--;
                count++;
            }else{
                count++;
                i++;j--;
            }
        }
        return count;
    }
}