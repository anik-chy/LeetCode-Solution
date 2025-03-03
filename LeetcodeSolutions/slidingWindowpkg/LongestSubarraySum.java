package LeetcodeSolutions.slidingWindowpkg;

public class LongestSubarraySum {
    public static int longestSubarray(int[] nums, int k) {
        int left = 0, sum = 0, maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Expand the window by adding nums[right]

            // Shrink the window if sum exceeds k
            while (sum > k) {
                sum -= nums[left]; // Remove leftmost element
                left++; // Move left pointer forward
            }

            // Update maxLength with the current window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 1, 1, 1, 3};
        int k = 5;
        System.out.println("Longest subarray length: " + longestSubarray(nums, k));
    }
}
