class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return -1;
        }
        Arrays.sort(nums);
        if(n>=3){
            return nums[1];
        }
        return -1;

    }
}