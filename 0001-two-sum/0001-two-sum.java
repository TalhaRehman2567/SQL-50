class Solution {
    public int[] twoSum(int[] nums, int target) {
         
         int[] ans = new int[2];

         for(int i = 0; i < nums.length; i++){  // Fixed "lenght" to "length"
            for(int j = i + 1; j < nums.length; j++){  // Fixed "lenght" to "length"
                if(nums[i] + nums[j] == target){  // Fixed "nums[i] = nums[j] == target"
                    ans[0] = i;
                    ans[1] = j;
                    return ans; // Return immediately when answer is found
                }
            }
         } 
        return new int[0]; // Return an empty array if no solution is found
    }
}