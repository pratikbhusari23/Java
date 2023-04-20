
import java.io.*;

class Demo {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());

		int arr[]= new int[size];
		
		int sum=0;
		
		int flag=0;

		System.out.println("Enter Array Elements : ");
		for(int i=0 ; i<arr.length ; i++){
			
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2!=0){
				flag=1;				
				sum+=arr[i];
			}
		}
		
		if(flag==1){
			System.out.println("Sum of Odd elements : "+sum);
		}
		else {
		
			System.out.println("No odd Elements Present !");
		}


	}
}
