class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> store = new Stack<>();
        for(String s:tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                    int n1 = store.pop();
                    int n = store.pop();
                    switch(s){
                        case "+" -> store.push(n1 + n);
                        case "-" -> store.push(n - n1);
                        case "*" -> store.push(n1 * n);
                        case "/" -> store.push(n / n1);
                    }

                
            }else{
                int value = Integer.parseInt(s);
                store.push(value);
            }
        }

        return store.pop();
    }
}
