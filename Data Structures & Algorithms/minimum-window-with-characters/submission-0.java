class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        int[] need= new int[128];
        int[] window = new int[128];

        for(char c:  t.toCharArray()){
            need[c]++;
        }

        int have = 0;
        int needCount =0;
        for(int i =0;i<128;i++){
            if(need[i] > 0){
                needCount++;
            }
        }
        int left =0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for(int right =0;right < s.length();right++){
            char c = s.charAt(right);
            window[c]++;
            if(need[c] > 0 && window[c]== need[c]) have++;
            while(have == needCount){
                if(right-left +1 < minLength){
                    minLength = right - left +1;
                    start = left;
                }
                char remove = s.charAt(left);
                window[remove]--;
                if(need[remove] > 0 && window[remove] < need[remove]){
                    have--;
                }
                left++;
            }
        }
        if(minLength == Integer.MAX_VALUE) return "";
        return s.substring(start,start + minLength);
    }
}
