
import java.io.*;

class Demo {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());

		int arr[]= new int[size];
		
		int product=1;
		
		System.out.println("Enter Array Elements : ");
		

		for(int i=0 ; i<arr.length ; i++){
			
			arr[i]=Integer.parseInt(br.readLine());

			if(i%2!=0){
				product*=arr[i];
			}
		}
		
		System.out.println("Product of Odd index : "+product);
		
	}
}
