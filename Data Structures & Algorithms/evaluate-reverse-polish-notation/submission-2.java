class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
            String ch = tokens[i];
            if(ch.equals("+")){
                int sum = st.pop();
                sum += st.pop();
                st.push(sum);
            }else if(ch.equals("-")){
                int sum = st.pop();
                sum = st.pop()-sum;
                st.push(sum);
            }else if(ch.equals("*")){
                int sum = st.pop();
                sum *= st.pop();
                st.push(sum);
            }else if(ch.equals("/")){
                int sum = st.pop();
                sum = st.pop()/sum;
                st.push(sum);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        if(!st.isEmpty()) return st.pop();
        return 0;
        // return st.pop();
    }
}
