class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && 
            temperatures[i] > temperatures[st.peek()]){
                int pI = st.pop();
                ans[pI] = i - pI;
            }
            st.push(i);
        }

        return ans;
    }
}
