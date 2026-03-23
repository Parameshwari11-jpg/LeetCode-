class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int window=0;window<nums.length;window++)
        {
            sum+=nums[window];
            while(sum>=target)
            {
                min=Math.min(min,window-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return min<Integer.MAX_VALUE?min:0;
    }
}