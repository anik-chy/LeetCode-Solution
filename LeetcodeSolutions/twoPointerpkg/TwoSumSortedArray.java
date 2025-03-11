package LeetcodeSolutions.twoPointerpkg;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int sum =0;

        while(left<right){
            sum= numbers[right]+numbers[left];
            if(sum==target){
                return new int[]{left+1,right+1};
                
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
        
    }
    public static void main(String[] args){
        int arr[] ={1,2,3,4};
        int target = 3;

        System.out.println("The indices of the array the sum matches with the target: "+Arrays.toString(twoSum(arr,target)));
    }

}
