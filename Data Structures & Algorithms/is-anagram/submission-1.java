class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // best aproach
        int count[] = new int[26];
        for(int i =0;i<s.length();i++){
            count[s.charAt(i)- 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int num : count){
            if(num != 0){
                return false;
            }

        }
        return true;




// brute force
// T.C = Time complexity: O(nlogn)

        // char[] count1 = s.toCharArray();
        // char[] count2 = t.toCharArray();
        // Arrays.sort(count1);
        // Arrays.sort(count2);

        // return Arrays.equals(count1, count2);

        
    }
}
