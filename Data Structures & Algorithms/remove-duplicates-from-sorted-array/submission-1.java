class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> set = new LinkedHashSet<>();

        // for(int num : nums){
        //     set.add(num);
        // }
        // int ind = 0;
        // for(int num : set){
        //     nums[ind++] = num;
        // }
        // return ind;

        if(nums.length ==0) return 0;
        int w = 1;
        for(int r = 1;r< nums.length;r++){
            if(nums[r] != nums[r-1]){
                nums[w] = nums[r];
                w++;
            }
        }
        return w;
    }
}