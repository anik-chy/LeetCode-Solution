package LeetcodeSolutions.twoPointerpkg;

import java.util.HashMap;

public class UnsortedPairWithDifference {
    public static int[] findPairWithIndices(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i]+k)){
                return new int[]{map.get(nums[i]+k),i};
            }
            if(map.containsKey(nums[i]-k)){
                return new int[]{map.get(nums[i]-k),i};

            }
            map.put(nums[i],i);
        }

        return new int[]{};

    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 8, 12};
        int k = 4;
        int[] result = findPairWithIndices(nums, k);
        System.out.println("Indices of the pair with difference " + k + ": " + 
                           (result.length == 0 ? "No pair found" : "[" + result[0] + ", " + result[1] + "]"));
    }
    

}
