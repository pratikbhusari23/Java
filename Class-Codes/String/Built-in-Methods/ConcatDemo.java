import java.io.*;

class ConcatDemo{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();	//Pratik
		String str2 = br.readLine();	//Bhusari
		String str3 =str1.concat(str2);

		System.out.println(str3);       //PratikBhusari
	
	}

}
