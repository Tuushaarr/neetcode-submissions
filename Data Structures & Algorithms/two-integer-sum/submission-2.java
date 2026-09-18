class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] solution = new int[2];
        for(int i = 0; i<nums.length; i++){
            int n = (target-nums[i] );
            if(!map.isEmpty() && map.containsKey(n)){
                solution[0] = map.get(n);
                solution[1] = i;
                return solution;
            }
            map.put(nums[i], i);
        }
        return solution;
    }
}
