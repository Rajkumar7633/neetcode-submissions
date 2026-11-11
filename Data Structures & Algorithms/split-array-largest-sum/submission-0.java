class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for(int num: nums){
            low = Math.max(low, num);
            high += num;
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(helper(nums, k , mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return low;
    }

    private boolean helper(int[] nums, int k ,int maxSum){
        int suba = 1;
        int currentS =0;
        for(int num : nums){
            if(currentS + num <= maxSum){
                currentS += num;
            }
            else{
                suba++;
                currentS = num;
            }
        }

        return suba <= k;
    }
}