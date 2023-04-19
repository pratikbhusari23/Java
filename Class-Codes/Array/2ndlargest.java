/*

class 2{
	
	public static void main(String[] args){
		
		System.out.println("Class name 2 doesnt works ");
	}
}

*/

import java.io.*;
import java.util.*;

class Largestno{

	
	public static void main(String[] args) throws IOException{
		
		int arr[] = new int[5];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str," ");

		for(int i=0 ; i<arr.length ; i++){
			
			arr[i]=Integer.parseInt(st.nextToken());
		}

		for(int i=0 ; i<arr.length ; i++){
			
			System.out.println(arr[i]+" ");
		}

		int largest=arr[0];
		int secondlargest = arr[0];

		for(int i=0 ; i<arr.length ; i++){
			
			if(arr[i]>largest){
				
				secondlargest = largest;
				largest = arr[i];
			}
			else {
				
				if(arr[i]<largest && arr[i]>secondlargest){
					
					secondlargest = arr[i];
				}
			}
		}
		System.out.println("Largest = "+ largest);
		System.out.println("Second Largest = "+ secondlargest);
		
		System.out.println();
	
	}

}
