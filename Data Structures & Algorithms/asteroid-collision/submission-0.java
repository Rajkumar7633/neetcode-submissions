class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        for(int ast : asteroids){
            boolean dest = false;
            while(!st.isEmpty() && ast <0 && st.peek() >0){
                if(st.peek() < -ast){
                    st.pop();
                }
                else if(st.peek() == -ast){
                    st.pop();
                    dest = true;
                    break;
                }
                else{
                    dest = true;
                    break;
                }
            }
            if(!dest){
                st.push(ast);
            }
        }
        int[] result = new int[st.size()];

        // Reverse because stack store element in reverse order
        for(int i = result.length-1;i >=0;i--){
            result[i] = st.pop();
        }
        return result;
    }
}