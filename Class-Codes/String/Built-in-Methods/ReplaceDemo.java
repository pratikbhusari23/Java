import java.io.*;

class ReplaceDemo{
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = "Pratik";

		str1=str1.replace("P","S");

		System.out.println(str1);
	
	}

}
