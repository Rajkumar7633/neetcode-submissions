class Solution {
    public int search(int[] nums, int target) {
        int lo =0; int high = nums.length - 1;

        while(lo <= high){
            int mid = lo + (high - lo) / 2;

            if(nums[mid]== target) return mid;
            if(nums[lo] <= nums[mid]){
                if(nums[lo] <= target && target < nums[mid]) high = mid -1;
                else lo = mid +1;
            }

            else{
                if(nums[mid]< target && target <= nums[high]) lo = mid+1;
                else high = mid -1;
            }
        }
        return -1;
    }
}
