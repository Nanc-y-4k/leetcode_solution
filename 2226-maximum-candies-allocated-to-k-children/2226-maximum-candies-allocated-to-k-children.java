
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int largest = 0;
        for (int amount : candies) {
            largest = Math.max(largest, amount);
        }
        int low = 1;
        int high = largest;
        int result = 0;
        while (low <= high) {
            int each = low + (high - low) / 2;
            long children = 0;
            for (int amount : candies) {
                children += amount / each;
            }
            if (children >= k) {
                result = each;
                low = each + 1;
            } else {
                high = each - 1;
            }
        }

        return result;
    }
}

