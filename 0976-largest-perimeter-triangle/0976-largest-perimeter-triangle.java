class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>1; i--){
            if(nums[i] < nums[i-1] + nums[i-2]){
                int sum = nums[i]+nums[i-1]+nums[i-2];
                return sum;
            }
        }
        
       return 0; 
        
    }
}