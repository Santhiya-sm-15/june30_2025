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