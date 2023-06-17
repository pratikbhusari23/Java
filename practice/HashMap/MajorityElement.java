/*

Majortiy Element 

Given an array of size n, find all elements in array that appear more than n/3 times.

input : [1,1,2,2,2,2,4,3,3]
output : 2

 */

import java.util.*;

class program2{
	
	static void MajorityElement(int nums[]){
	
		HashMap<Integer , Integer> map = new HashMap<Integer,Integer>();
		
		int n=nums.length;

		for(int i=0 ; i<n ; i++){
			
			if(map.containsKey(nums[i])){
				
				map.put(nums[i],map.get(nums[i])+1);
			}
			else{
				map.put(nums[i],1);
			}
		}

		for(int key : map.keySet()){
			
			if(map.get(key)>n/3){
				
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args){
		
		int nums[]={1,2};

		MajorityElement(nums);	

	}
}
