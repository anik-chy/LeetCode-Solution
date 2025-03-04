package LeetcodeSolutions.slidingWindowpkg;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26]; // Frequency array for letters A-Z
        int maxCount=0;
        int left=0;
        int maxLength=0;

        for (int right = 0; right < s.length(); right++) {
            // Increase the count of the current character
            count[s.charAt(right) - 'A']++;

            // Update maxCount, which tracks the frequency of the most frequent character in the current window
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // If the number of characters to replace exceeds k, move the left pointer
            int replacedItem = right-left+1-maxCount;
            if (replacedItem > k) {
                // Shrink the window from the left
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Calculate the maximum window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        
        String s1 = "XYYX";
        int k1 = 2;
        System.out.println(characterReplacement(s1, k1)); // Output: 4

        String s2 = "AAABABB";
        int k2 = 1;
        System.out.println(characterReplacement(s2, k2)); // Output: 5
    }
    
}
