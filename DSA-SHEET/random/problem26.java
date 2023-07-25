/*
26. Remove Duplicates from Sorted Array
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int x=0;
        for(int i=0 ; i<nums.length ; i++){

            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            nums[x]=nums[i];
            x++;
        }
        return x;
    }
}