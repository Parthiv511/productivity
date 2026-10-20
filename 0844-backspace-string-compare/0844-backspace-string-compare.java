class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String str){
        Stack<Character> stk = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '#')
            {
                if(!stk.isEmpty())
                   stk.pop();
            }
        else{
            stk.push(ch);
        }
        }
        StringBuilder res = new StringBuilder();

        for(char c : stk){
            res.append(c);
        }
        return res.toString();

    }
}