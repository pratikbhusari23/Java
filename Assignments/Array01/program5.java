
import java.io.*;

class Demo {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());

		int arr[]= new int[size];
		
		int product=1;
		
		System.out.println("Enter Array Elements : ");
		
		int flag=0;

		for(int i=0 ; i<arr.length ; i++){
			
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%5==0){
				flag=1;
			}
		}
		if(flag==1){
			System.out.println("Elemenst Divisible by 5 Include :");
			for(int i=0 ; i<arr.length ; i++){
			
				if(arr[i]%5==0){
				
					System.out.println(arr[i]+" ");
				
				}
			}
		}
		else {
			System.out.println("No Single element present that is divisible by 5 !");
		}
	}
}
