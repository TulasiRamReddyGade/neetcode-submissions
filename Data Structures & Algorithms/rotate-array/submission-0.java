class Solution {
    public void rotate(int[] nums, int k) {
         k = k%nums.length;
            for(int i=0;i<k;i++){
                rotate(nums);
            }
        }
        public void rotate(int[] nums){
            int temp = nums[nums.length-1];
            for(int i=0;i<nums.length;i++){
                int t1 = nums[i];
                nums[i]=temp;
                temp=t1;
            }
        }
}