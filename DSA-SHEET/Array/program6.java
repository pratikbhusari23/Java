/*

33. Search in Rotated Sorted Array
Medium
22.4K
1.3K
Companies
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104

 */

import java.util.*;
class Solution{
	
	static int searchInRotatedArray(int arr[] ,int target){
		
		int low=0;
		int high = arr.length-1;
		int k = target;

		while(low<=high){
			
			int mid = (low+high)/2;

			if(arr[mid]==k){
				return mid;
			}
			if(arr[low]<=arr[mid]){
				
				if(arr[low]<= k && k<=arr[mid]){
					high = mid-1;
				}
				else{
					low = mid+1;
				}
			}
			else {
				if(arr[mid]<=k && k <=arr[high]){
					low = mid+1;
				}
				else {
					high = mid -1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size :");
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize];
		
		System.out.print("Enter array elements :");
		for(int i=0 ; i<arr.length ; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target variable : ");
		int target = sc.nextInt();
		System.out.println(searchInRotatedArray(arr,target));
	
	}
}
