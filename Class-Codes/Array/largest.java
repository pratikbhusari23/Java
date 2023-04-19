
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

		for(int i=0 ; i<arr.length ; i++){
			
			if(arr[i]>largest){
				largest = arr[i];
			}
		}
		System.out.println("Largest = "+ largest);
				
		System.out.println();
		
		int Lowest=arr[0];

		for(int i=0 ; i<arr.length ; i++){
			
			if(arr[i]<Lowest){
				Lowest = arr[i];
			}
		}
		System.out.println("Lowest = "+ Lowest);
				
		System.out.println();
	}
}
	
