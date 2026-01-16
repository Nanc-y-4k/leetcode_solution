class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minindex]){
                    minindex=j;
                }
            }
            int temp=nums[minindex];
            nums[minindex]=nums[i];
            nums[i]=temp;
        }
        for(int num:nums){
            System.out.println(num+" ");
        }
        return nums;
        
    }
}