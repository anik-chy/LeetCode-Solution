package LeetcodeSolutions.slidingWindowpkg;

import java.util.HashMap;

    public class MinimumWndowSubString{

        public static String minLength(String s, String t){
            if(s.length()<t.length()){
                return "";
            }
            HashMap<Character,Integer> tCount = new HashMap<>();
            HashMap<Character,Integer> sCount = new  HashMap<>();

            for(char c: t.toCharArray()){
                tCount.put(c,tCount.getOrDefault(c, 0)+1);
            }

            int formed=0;
            int minStart=0;
            int minLength= Integer.MAX_VALUE;
            int left =0;

            for(int right=0;right<s.length();right++){
                char c=s.charAt(right);
                sCount.put(c,sCount.getOrDefault(c,0)+1);

                if(tCount.containsKey(c)&& sCount.get(c).intValue()==tCount.get(c).intValue()){
                    formed++;
                }

                while(formed==tCount.size()){
                    if(right-left+1<minLength){
                        minLength=right-left+1;
                        minStart=left;

                    }
                    char k = s.charAt(left);
                    sCount.put(k,sCount.getOrDefault(k,0)-1);

                    if(tCount.containsKey(k)&& sCount.get(k)<tCount.get(c)){
                        formed--;
                    }
                    left++;

                }
            }
            return minLength==Integer.MAX_VALUE?" ":s.substring(minStart,minStart+minLength);
        }

        public static void main(String[] args){
            String s = "CXAXXYLZBC";
            String t ="XYZ";
            System.out.println("The shortest substring is: "+minLength(s,t));

        }
        
    }
