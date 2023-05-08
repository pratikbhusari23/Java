import java.io.*;

class IndexOfDemo{
	
	public static void main(String[] pratik)throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str1 = br.readLine();

		System.out.println(str1.lastIndexOf('h',5));                   // 'h' letter to search , upto index
//		System.out.println(str1.lastIndexOf('h',1));
//		System.out.println(str1.lastIndexOf('h',5));
	}


}
