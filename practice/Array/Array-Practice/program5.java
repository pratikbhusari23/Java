/*

Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and find the min number from the array

Input:
n=6
Enter elements in the array:
2
3
6
9
5
1
Output:
1

 */

import java.io.*;

class program5 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array");
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		int min=0;
		for(int i=0 ; i<arr.length ; i++){
			
			arr[i]=Integer.parseInt(br.readLine());
			min=arr[0];
	
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
	}	

}
