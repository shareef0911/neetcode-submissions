class Solution {
    public boolean isValid(String s) {

        char[] paranthesis = s.toCharArray();

        Stack<Character> balancedParanthesis = new Stack<>();

        for(char c : paranthesis){

            if(c=='{' || c=='[' || c=='('){
                balancedParanthesis.push(c);
            }else if( c=='}' || c==']' || c==')'){
                char top ;
                if(balancedParanthesis.isEmpty()){
                    return false;
                }else{
                    top = balancedParanthesis.pop();
                

                if( (c=='}' && top != '{') || (c==']' && top != '[') || (c==')' && top !='(' )){
                    return false;
                }
                }
            }
        }
        return balancedParanthesis.isEmpty();
        
    }
}
