class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length()); // length
            sb.append('#'); // seperator
            sb.append(str); //. actual STring
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<>();
        int i =0;
        while(i < str.length()){
            int j = i;

            // find '#'
            while(str.charAt(j) != '#') j++;

            //length of current string
            int length = Integer.parseInt(str.substring(i,j));

            //Actual string starts after '#'

            String word = str.substring(j +1, j+1+length);
            ans.add(word);

            i = j +1+ length;
        }

        return ans;
    }
}
