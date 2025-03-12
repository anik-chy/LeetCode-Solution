package LeetcodeSolutions.twoPointerpkg;

import java.util.Arrays;

public class PairWithDiference {
    
    public static int[] pairDifference(int[] numbers, int k) {
        int left=0;
        int right=numbers.length-1;
        int diff=0;

        while(left<right){
            diff= numbers[right]-numbers[left];
            if(diff==k){
                return new int[]{left,right};
                
            }else if(diff>k){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
        
    }
    public static void main(String[] args){
        int arr[] ={1, 3, 5, 8, 12};
        int target = 4;

        System.out.println("The indices of the array the difference matches with the target: "+Arrays.toString(pairDifference(arr,target)));
    }

}



