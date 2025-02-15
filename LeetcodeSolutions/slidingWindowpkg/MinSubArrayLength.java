package LeetcodeSolutions.slidingWindowpkg;

public class MinSubArrayLength {

    private static int minSubArrayLength(int[] nums, int target) {
        int left=0;
        int minLength= Integer.MAX_VALUE;
        int sum=0;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            while(sum>=target){
                minLength=Integer.min(minLength,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }

    public static void main(String[] args){
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("Smallest subarray lenth that has a sum equals to more than the target: "+ minSubArrayLength(nums,target));
            }
        
           
}

