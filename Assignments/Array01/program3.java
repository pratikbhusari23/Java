
import java.io.*;

class Demo {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());

		int arr[]= new int[size];
		
		int product=1;
		
		System.out.println("Enter Array Elements : ");
		
		int flag=0; //if Zero even elements Present

		for(int i=0 ; i<arr.length ; i++){
			
			arr[i]=Integer.parseInt(br.readLine());

			if(i%2!=0){
				flag=1;  // If even elements present
				product*=arr[i];
			}
		}
		
		if(flag==0){
		
			System.out.println("No Even elements Present");
		}
		else{
			System.out.println("Product of Odd index : "+product);
		}


	}
}
