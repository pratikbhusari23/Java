/*

Q1. Count of elements
Problem Description :
- Given an array A of N integers.
- Count the number of elements that have at least 1 element greater than
itself.
Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109

Example Input
Input 1:
A = [3, 1, 2]
Output:
2
Explanation:
- The elements that have at least 1 element greater than itself are 1 and 2
Input 2:
A = [5, 5, 3]
Output:
1
Explanation:
- The element that has at least 1 element greater than itself is 3.

*/
class GreaterThanItself{
	
	public static void main(String[] args){
		
		int arr[]={1,2,3};
		
		
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0 ; j<arr.length ; j++){
				
				if(arr[i]<arr[j]){
					System.out.println("The elements that have at least 1 element greater than itself are : "+arr[i]);
					break;
				}
			}
		}
	}
}
