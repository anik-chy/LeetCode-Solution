package LeetcodeSolutions.slidingWindowpkg;

public class MaxConsecutiveOnes {
    private static int maxConsecutiveOnes(int[] nums, int k){
        int maxLength= 0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                k--;
            }
            while(k<0){
                if(nums[left]==0){
                    k++;
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
        
    }
    public static void main(String[] args){
        int[] nums ={1,1,0,0,1,1,1,0,1};
        int k=2;
        System.out.println("Maximum Consecutive 1s: " + maxConsecutiveOnes(nums, k));
    }

}
