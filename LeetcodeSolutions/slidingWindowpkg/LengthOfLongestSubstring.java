package LeetcodeSolutions.slidingWindowpkg;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    private static int longestSubStringLength(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength= Integer.MIN_VALUE;
        int left=0;

        for(int right=0; right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(right));
            maxLength= Integer.max(maxLength, right-left+1);


        }
        return maxLength;

    }

    public static void main(String[] args){
        String s ="abcabcbb";
        System.out.println("Longest Substring is: "+ longestSubStringLength(s));
            }
        
            

}
