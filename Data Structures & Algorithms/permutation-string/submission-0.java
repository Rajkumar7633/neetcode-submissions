class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] need = new int[26];
        int[] window = new int[26];

        for(char c : s1.toCharArray()){
            need[c-'a']++;
        }
        int k = s1.length();

        // first window
        for(int i=0;i<k;i++){
            window[s2.charAt(i) - 'a']++;
        }
        if(match(need, window)){
            return true;
        }

        // slide
        for(int i =k;i < s2.length();i++){
            window[s2.charAt(i) - 'a']++;
            window[s2.charAt(i - k) - 'a']--;
            if(match(need,window)) return true;
        }
        return false;
    }
    private boolean match(int[] a , int[] b){
        for(int i =0;i < 26;i++){
            if(a[i] != b[i]) return false;
        }

        return true;
    }
}
