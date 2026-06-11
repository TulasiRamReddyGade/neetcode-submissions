class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        int cnt = 0;
        while(i<nums.length){
            if(nums[i]==val){
                cnt++;
                i++;
                continue;
            }
            nums[j]=nums[i];
            i++;
            j++;
        }
        return nums.length - cnt;
    }
}