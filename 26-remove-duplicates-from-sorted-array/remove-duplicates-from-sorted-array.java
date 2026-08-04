class Solution {
    public int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        // remove dublicated
        int st=0;
        for(int i=1; i<nums.length; i++){
            if(nums[st] < nums[i]){
                int temp = nums[st+1];
                nums[st+1]=nums[i];
                nums[i]=temp;
                st++;

            }
        }
        return st+1;
    }
}
