package LeetcodeSolutions.slidingWindowpkg;

import java.util.*;

public class SlidingWindowMaximum {
    public  static int[] findMaximum(int[] nums, int k) {
        if (nums.length == 0) return new int[0];

        Deque<Integer> deque = new LinkedList<>();  // Stores indices of elements
        int[] result = new int[nums.length - k + 1];
        int index = 0;

        for (int right = 0; right < nums.length; right++) {
            // Remove elements from the front that are out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < right - k + 1) {
                deque.pollFirst();
            }

            // Maintain decreasing order in deque (remove smaller elements from back)
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.offerLast(right);

            // Once we have at least k elements in the window, record the maximum
            if (right >= k - 1) {
                result[index++] = nums[deque.peekFirst()];
            }
        }

        return result;

       
    }

    public static void main(String[] args){
        int nums[] ={1,2,1,0,4,2,6};
        int k=3;
        //int [] result= findMaximum(nums,k);
        System.out.println("Maximum result is: "+ Arrays.toString(findMaximum(nums, k)));
    }

        
           

}
