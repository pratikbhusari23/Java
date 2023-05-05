import java.io.*;

class CharAtDemo{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();

		System.out.println(str1.charAt(4));
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(6));
	}
}
