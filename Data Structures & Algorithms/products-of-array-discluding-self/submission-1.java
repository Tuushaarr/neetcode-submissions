class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int flag = 0;

        int front = 1;
        int back = 1;
        for(int i = n-1; i>=0; i--){
            if(nums[i] == 0){
                int count = zeroCount(nums);
                if(count == 1){
                    flag = 1;
                    i--;
                }else if(count > 1){
                    return result;
                }      
            }
            if(i>=0){
                back *= nums[i];
            }
            if(flag == 1){
                for(int j = 0; j<i; j++){
                    front *= nums[j];
                }
                result[i+1] = front * back;
                return result;
            }
        }
        for(int i = 0; i<n; i++){

            result[i] = back/nums[i];

        }
        return result;
    }
    public int zeroCount(int[] nums){
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                count++;
            }
        }
        return count;
    }
}  
