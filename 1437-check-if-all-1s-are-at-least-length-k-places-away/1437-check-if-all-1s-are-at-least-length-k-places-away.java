class Solution {
    public boolean kLengthApart(int[] nums, int k) {
       int lastone=-(k+1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(i-lastone-1<k){
                    return false;
                }
                lastone=i;
            }

        }
        return true;
    }
}