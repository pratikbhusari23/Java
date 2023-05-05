import java.io.*;

class LengthDemo{
	
	public static void main(String[] args) throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();

		System.out.println(str1.length());   //8
	}
}
