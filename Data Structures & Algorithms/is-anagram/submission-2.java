// class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(char ch : s.toCharArray()){
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }
//         for(char ch : t.toCharArray()){
//             if(!map.isEmpty() && map.containsKey(ch)){
//                 map.put(ch,map.get(ch)-1);
//                 if(map.get(ch) == 0){
//                     map.remove(ch);
//                 }
//             }else return false;
//         }
//         if(map.isEmpty()) return true;
//         return false;

//     }
// }


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i : count){
            if(i != 0)return false;
        }
        return true;

    //     char[] sSort = s.toCharArray();
    //     char[] tSort = t.toCharArray();

    //     Arrays.sort(sSort);
    //     Arrays.sort(tSort);

    //     return Arrays.equals(sSort, tSort);

    }
}
