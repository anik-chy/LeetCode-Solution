package LeetcodeSolutions.slidingWindowpkg;
import java.util.*;

public class FindAnagrams {
    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        if (s.length() < p.length()) {return result;}

        int left =0;

        for(char c: p.toCharArray()){
            pCount[c-'a']++;
        }

        for(int right =0;right<s.length();right++){
            sCount[s.charAt(right)-'a']++;

            if(right>=p.length()-1){
                if(Arrays.equals(sCount,pCount)){
                    result.add(left);
                }
                sCount[s.charAt(left)-'a']--;
                left++;
            }

        }        
        return result;
    }
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p ="abc";
        System.out.println("Anagram indices: " + findAnagrams(s, p));
            }
        
            

}
