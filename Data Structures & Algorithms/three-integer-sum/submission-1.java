class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int st = i+1;
            int ls = nums.length-1;
            while(st<ls){
                int sum = nums[st] + nums[ls] + nums[i];
                if(sum < 0){
                    st++;
                }else if(sum > 0){
                    ls--;
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[st]);
                    list.add(nums[ls]);
                    result.add(list);
                    st++;
                    ls--;
                    while(st < ls && nums[st] == nums[st-1]) st++;
                    while(st < ls && nums[ls] == nums[ls+1]) ls--;
                }
            }
        }
        return result;
    }
}
