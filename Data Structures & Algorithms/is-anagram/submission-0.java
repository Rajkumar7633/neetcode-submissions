class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] count1 = s.toCharArray();
        char[] count2 = t.toCharArray();
        Arrays.sort(count1);
        Arrays.sort(count2);

        return Arrays.equals(count1, count2);

        
    }
}
