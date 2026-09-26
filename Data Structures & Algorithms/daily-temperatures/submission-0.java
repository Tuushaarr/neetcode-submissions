class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = n-1; i>=0; i--){
            // int count = 1;
            while(!st.isEmpty() && st.peek()<=temperatures[i]){
                st.pop();
                // count++;
            }
            if(!st.isEmpty() && st.peek() > temperatures[i]){
                arr[i] = map.get(st.peek())-i;
            }else{
                arr[i] = 0;
            }
            st.push(temperatures[i]);
            map.put(temperatures[i], i);
        }
        return arr;
    }
}
