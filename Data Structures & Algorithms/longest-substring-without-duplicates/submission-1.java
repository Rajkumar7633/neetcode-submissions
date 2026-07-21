class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int max =0;
        // for(int i =0;i<s.length();i++){
        //     HashSet<Character> set = new HashSet<>();
        //     for(int j =i;j<s.length();j++){
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }

        //         set.add(s.charAt(j));
        //         max = Math.max(max, j - i +1);
        //     }
        // }
        // return max;

        HashSet<Character>seen = new HashSet<>();
        int l = 0;
        int mL =0;
        for(int r =0;r < s.length();r++){
            while(seen.contains(s.charAt(r))){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            mL = Math.max(mL, r -l + 1);
        }
        return mL;


    }
}
