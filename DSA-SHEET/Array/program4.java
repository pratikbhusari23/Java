/*

217. Contains Duplicate
Easy
10K
1.2K
Companies
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109

*/

import java.util.*;

class program4 {
    public static boolean containsDuplicate(int[] nums) {

        HashSet <Integer> map = new HashSet<>();

        for(Integer value : nums){

            if(map.add(value)==false){
                return true ;
            }
        }

        return false ;
    }

    public static void main(String[] args) {
        
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}