
import java.io.*;

class Demo {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array :");

		int size = Integer.parseInt(br.readLine());

		int arr[]= new int[size];
				
		System.out.println("Enter Array Elements(Character Only !): ");

		for(int i=0 ; i<arr.length ; i++){
			
			arr[i] = br.readLine().charAt(0);

		}
		
		for(int i=0 ; i<arr.length ; i++){
		
			if(arr[i]=='a'||arr[i]=='A'||arr[i]=='e'||arr[i]=='E'||arr[i]=='i'||arr[i]=='I'||arr[i]=='o'||arr[i]=='O'||arr[i]=='u'||arr[i]=='U'){
				
				System.out.print(((char)arr[i])+" ");
			}
		}
	}
}
