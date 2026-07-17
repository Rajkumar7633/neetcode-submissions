class Solution {
    public int maxArea(int[] heights) {
        // int ans =0;
        // for(int i =0;i<heights.length;i++){
        //     for(int j =i+1;j<heights.length;j++){
        //         int area = (j - i) * Math.min(heights[i], heights[j]);
        //         ans = Math.max(ans, area); 
        //     }
        // }
        // return ans;

        int left =0;
        int right = heights.length -1;
        int maxArea = 0;
        while(left < right){
            int area = (right - left) * Math.min(heights[left],  heights[right]);

            maxArea = Math.max(maxArea, area);

            if(heights[left] < heights[right]) left++;
            else right--;
        }

        return maxArea;
    }
}
