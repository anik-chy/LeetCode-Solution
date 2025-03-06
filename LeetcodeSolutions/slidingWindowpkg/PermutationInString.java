package LeetcodeSolutions.slidingWindowpkg;

import java.util.Arrays;

public class PermutationInString {

    
    public static boolean checkInclusion(String s1, String s2) {
        int pCount[] = new int[26];
        int sCount[] = new int[26];
        int left=0;

        for(char c:s1.toCharArray()){
            pCount[c-'a']++;
        }
        
        for(int right=0;right<s2.length();right++){
            sCount[s2.charAt(right)-'a']++;

            if(right>=s1.length()-1){
                if(Arrays.equals(pCount,sCount)){
                    return true;
                }
                sCount[s2.charAt(left)-'a']--;
                left++;
            }
        }
        return false;
    }



    public static void main(String[] args){
        String s1 = "abc";
        String s2="lecabee";
        System.out.println("Result is: "+ checkInclusion(s1,s2));
            }
        
           
}

