import java.io.*;

class StringCompare {

	static int mystrlen(String str){
		
		char arr[] = str.toCharArray();

		return arr.length;

	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String 1");
		String str1 = br.readLine();

		System.out.println("Enter String 2");
		String str2 = br.readLine();

		if(mystrlen(str1)==mystrlen(str2)){
			
			System.out.println("Length are equal");

		}
		else {
			System.out.println("Length are not equal ");
		}

	}
}
