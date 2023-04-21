
import java.io.*;

class Demo {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());

		int arr[]= new int[size];
		
		int even=0,odd=0;
		
		System.out.println("Enter Array Elements : ");
		for(int i=0 ; i<arr.length ; i++){
			
			arr[i]=Integer.parseInt(br.readLine());
							
			if(arr[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
			
		}
		
		System.out.println("Number of Even Elements : "+even +"\n"+"Number of Odd Elements : "+odd);

	}
}
