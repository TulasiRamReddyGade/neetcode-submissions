class Solution {
    public int removeDuplicates(int[] nums) {
         int i=0,j=1;
        int cnt = 0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                nums[j]=-200;
                j++;
            }else{
                i=j;
                j++;
            }
        }
        i=0;j=1;
        while(i<nums.length){
            if(nums[i]==-200){
                j=i+1;
                while(j<nums.length&&nums[j]==-200){
                    j++;
                }
                if(j<nums.length && nums[j]!=-200){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            i++;
        }
        i=0;
        while(i<nums.length){
            if(nums[i]!=-200)
                cnt++;
            i++;
        }
        return cnt;
    }
}