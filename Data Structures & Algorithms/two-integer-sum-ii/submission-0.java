class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st = 0;
        int ls = numbers.length-1;
        while(st < ls){
            int sum = numbers[st] + numbers[ls];
            if(sum < target){
                st++;
            }else if(sum > target){
                ls--;
            }else{
                return new int[]{st+1, ls+1};
            }
        }
        return new int[0];
    }
}
