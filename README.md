# june30_2025
The problem that I solved today

1.We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

Code:
class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0,r=0;
        int max=0;
        while(r<n)
        {
            while(nums[r]-nums[l]>1)
                l++;
            if(nums[r]-nums[l]==1)
                max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
