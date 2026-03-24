
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        return sum(nums,target);


    }

    public static  int[] sum(int[] arr,int targe){

        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==targe){
                      return new int[] {i, j};
                }
            }
        }
        return new int[]{};


    }
}