// valid parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            if(!stack.isEmpty()){
                char last = stack.peek();
                if(isPair(last,current)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(current);
        }
        return stack.isEmpty();
    }
    private boolean isPair(char last,char cur){
        return (last == '(' && cur == ')') ||
               (last == '{' && cur == '}') ||
               (last == '[' && cur ==']');
    }
}
