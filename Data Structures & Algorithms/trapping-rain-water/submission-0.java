class Solution {
    public int trap(int[] height) {
        int maxPossible[] = new int[height.length];
        int max = height[height.length-1];
        for(int i=height.length-1;i>=0;i--){
            maxPossible[i]=max;
            max=Math.max(max,height[i]);
        }

        int totalCapacity = 0,i=0,j=0;

        while(j<height.length){
            if(i==j){
                j++; continue;
            }
            if(height[j]>=height[i]){
                i=j;
            }else{

                if(maxPossible[j]>height[j]) {
                    int h = Math.min(height[i],maxPossible[j]);
                    totalCapacity += h - height[j];
                }
                j++;
            }
        }
        return totalCapacity;
    }
}
