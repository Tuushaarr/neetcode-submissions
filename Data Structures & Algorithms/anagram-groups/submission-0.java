class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = new ArrayList<>();
        for(String st : strs){
            list.add(st);
        }
        List<List<String>> result = new ArrayList<>();
        int n = list.size();
        int i = 0;
        while(list.size() != 0){
            n = list.size();
            int[] arr = new int[26];
            String st = list.get(i);
            int l = st.length();
            for(int j = 0; j<l; j++){
                arr[st.charAt(j)-'a']++;
            }
            List<String> list2 = new ArrayList<>();
            list2.add(st);
            for(int j = i+1; j<n; j++){
                int[] tempArr = new int[26];
                String tempSt = list.get(j);
                int m = tempSt.length();
                for(int k = 0; k<m; k++){
                    tempArr[tempSt.charAt(k)-'a']++;
                }
                if(Arrays.equals(arr,tempArr)){
                    list2.add(tempSt);
                    list.remove(j);
                    j--;
                }
                n = list.size();
            }
            list.remove(i);
            n = list.size();
            result.add(list2);

        }
        return result;
    }
}
