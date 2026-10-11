class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int idx=0;
        for(int i=0; i<n; i++){
            if(max<nums[i]){
                max=nums[i];
                idx=i;
            }
        }
        for(int i=0; i<n; i++){
            if(max==nums[i]){
                continue;
            }else if(max <nums[i]*2){
                return -1;
            }
        }
        return idx;
        

    }
}