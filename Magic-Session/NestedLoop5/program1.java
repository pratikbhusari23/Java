import java.io.*;

class Pattern{


	public static void main(String[] args) throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter No of Rows :");
		int rows = Integer.parseInt(br.readLine());
		
		System.out.println();
		
		int temp=rows;

		for(int i=1 ; i<=rows ; i++){
			int num=temp*i;
			for(int j=rows ; j>=i ; j--){
				
				System.out.print(num+" ");
				num=num-i;
			}
			temp--;
			System.out.println();
		
		}
	
	}





}
