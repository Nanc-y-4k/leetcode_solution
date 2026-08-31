class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;

        mergeSort(nums, left, middle);
        mergeSort(nums, middle + 1, right);

        merge(nums, left, middle, right);
    }

    private void merge(int[] nums, int left, int middle, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = middle + 1;
        int index = 0;

        while (i <= middle && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[index++] = nums[i++];
            } else {
                temp[index++] = nums[j++];
            }
        }
        while (i <= middle) {
            temp[index++] = nums[i++];
        }
        while (j <= right) {
            temp[index++] = nums[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}

