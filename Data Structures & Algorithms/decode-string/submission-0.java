class Solution {
    public String decodeString(String s) {
        Stack<Integer> countS = new Stack<>();
        Stack<StringBuilder> stringS = new Stack<>();

        StringBuilder current = new StringBuilder();
        int count =0;

        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                count = count * 10 + (ch -'0'); 
            }
            else if(ch=='['){
                countS.push(count);
                stringS.push(current);
                current = new StringBuilder();
                count = 0;
            }
            else if(ch==']'){
                int repeat = countS.pop();
                StringBuilder prev = stringS.pop();
                for(int i =0;i<repeat;i++){
                    prev.append(current);
                }
                current = prev;
            }
            else{
                current.append(ch);
            }
        }
        return current.toString();

    }
}
