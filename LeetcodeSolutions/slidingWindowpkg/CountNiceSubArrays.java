package LeetcodeSolutions.slidingWindowpkg;



public class CountNiceSubArrays {
    private static int countNiceSubArrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    
        private static int atMost(int[] nums, int k) {
            int left=0;
            int count=0;
            for(int right=0;right<nums.length;right++){
                k=k-nums[right]%2;
            
    
            while(k<0){
                k=k+nums[left]%2;
                left++;
            }
            count=right-left+1;
    
        }
        return count;
    }

    public static void main(Stirng[] args){
        int[] nums={1,1,2,1,1};
        int k=3;
        System.out.println("Number of Subarrays: "+countNiceSubArrays(nums,k));
    }

    

}
