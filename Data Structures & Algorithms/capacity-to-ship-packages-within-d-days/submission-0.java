class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left =0;
        int right = 0;
        for(int weight: weights){
            left = Math.max(left, weight);
            right += weight;
        }

        int answer = right;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(canShip(weights, mid, days)){
                answer = mid;
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }       
        return answer;
    }

    private boolean canShip(int[] weights, int capacity, int days){
        int dayU = 1;
        int currentW =0;
        for(int weight: weights){
            if(currentW + weight > capacity){
                dayU++;
                currentW = 0;
            }
            currentW += weight;
        }
        return dayU <= days;
    }
}