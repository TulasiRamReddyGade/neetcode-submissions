class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] sufixProduct = new int[nums.length];
        int[] result = new int[nums.length];

        prefixProduct[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixProduct[i] = prefixProduct[i-1]*nums[i];
        }
        sufixProduct[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            sufixProduct[i] = sufixProduct[i+1]*nums[i];
        }

        // 1 2 4 6
        // 1 2 8 48
        // 48 48 24 6

        for(int i=0;i<nums.length;i++){
            if(i==0){
                result[i]=sufixProduct[i+1];
            }else if(i==nums.length-1){
                result[i]=prefixProduct[i-1];
            }else{
                result[i]=sufixProduct[i+1]*prefixProduct[i-1];
            }
        }
        return result;
    }
}  
