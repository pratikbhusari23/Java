import java.io.*;

class IndexOfDemo{
	
	public static void main(String[] pratik)throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str1 = br.readLine();

		System.out.println(str1.indexOf('h',0));                   // 'h' letter to search , 0 index to start the search
		System.out.println(str1.indexOf('h',1));
		System.out.println(str1.indexOf('h',5));
	}


}
