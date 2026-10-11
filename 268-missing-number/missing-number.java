class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int count=0;
        // int sum=n*(n+1)/2;
        for(int i=1; i<=n; i++){
            count+=i;
        }
        int ans=0;

        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
        }
        
        return count-ans;
        
    }
}