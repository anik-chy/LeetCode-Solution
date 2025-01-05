
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

// import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int num:nums){
            if(hash.containsKey(num)){
                hash.put(num,hash.get(num)+1);
            }else{
                hash.put(num,1);
            }
        }

        int maxCount=0;
        int maxElement=0;

        for(Integer key:hash.keySet()){
            if(hash.get(key)>maxCount){
                maxCount=hash.get(key);
                maxElement=key;
            }
        }
        return maxElement;
    }

    public static void main(String[]args){
        int nms[]={3,6,8,8,4,8,3,1};
        System.out.println(majorityElement(nms));
        System.out.println();

}
}
