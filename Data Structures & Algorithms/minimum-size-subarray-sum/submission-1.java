class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int ans = Integer.MAX_VALUE;
        // for(int i =0;i<nums.length;i++){
        //     int sum =0;
        //     for(int j =i;j<nums.length;j++){
        //         sum +=nums[j];
        //         if(sum >= target){
        //             ans = Math.min(ans, j -i +1);
        //             break;
        //         }
        //     }
        // }
        // return ans == Integer.MAX_VALUE ? 0 : ans;


        int left =0;
        int sum =0;
        int minL = Integer.MAX_VALUE;
        for(int right =0;right < nums.length;right++){
            sum += nums[right];
            while(sum >= target){
                minL = Math.min(minL, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minL == Integer.MAX_VALUE ? 0 : minL;
    }
}