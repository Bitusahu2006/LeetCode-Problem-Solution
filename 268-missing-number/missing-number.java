class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        // int sum=0;
        
        // for(int i=0; i<=n; i++){
        //     sum+=i;
        // }
        int sum=n*(n+1)/2;

        for(int i=0; i<n; i++){
            ans+=nums[i];
        }
        int final_ans=sum-ans;
        return final_ans;
        
    }
}