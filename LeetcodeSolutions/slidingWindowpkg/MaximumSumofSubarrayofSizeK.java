package LeetcodeSolutions.slidingWindowpkg;

public class MaximumSumofSubarrayofSizeK {
    
    private static int maxSumSubarray(int[] nums, int k) {
        int windowSum = 0;
        int maxSum = 0;
        int left = 0;


        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right]; // Add next element

            // If window size is reached
            if (right >= k - 1) {
                maxSum = Math.max(maxSum, windowSum); // Update max sum
                windowSum -= nums[left]; // Remove left element from sum
                left++; // Move window forward
            }
        }
        return maxSum;
    }
    public static void main (String[] args){
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSumSubarray(nums, k));
    }

   

    

}
