class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        int j=1;
        Arrays.sort(nums);
        while(j<n){
            if(nums[j]==nums[j-1]){
                return true;
            }
            j++;
        }
        return false;
    }
}
