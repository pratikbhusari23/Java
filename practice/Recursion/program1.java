import java.io.*;

class Numbers{
	
	static void print(int num,int m){
		
		if(m>num){
			return ;
		}
		System.out.println(m);
		print(num,++m);
	}

	public static void main(String[] args) throws Exception{
		
		System.out.println("Enter number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int m=1;
	//	print(num,m);
		System.out.println(7%4);
	}
}
