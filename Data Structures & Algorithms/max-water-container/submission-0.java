class Solution {
    public int maxArea(int[] heights) {
        int maxi = 0;
        int l = 0;
        int r = heights.length-1;
        while(l<r){
            maxi = Math.max(maxi, (Math.min(heights[l], heights[r])*(r-l)));
            if(heights[l] <= heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxi;
    }
}
