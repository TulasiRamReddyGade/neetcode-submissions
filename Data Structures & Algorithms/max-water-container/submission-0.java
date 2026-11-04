class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int capacity = 0;
        while (i<j){
            int height = Math.min(heights[i],heights[j]);
            int width = j-i;
            capacity = Math.max(capacity,height*width);
            if(heights[i]<heights[j])
                i++;
            else
                j--;
        }
        return capacity;
    }
}
