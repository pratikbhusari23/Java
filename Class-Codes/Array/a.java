import java.io.*;
import java.util.*;

class Demo{
	public static void main(String args[])throws IOException{
		int arr[]=new int[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.print("Enter the String");
		String str =br.readLine();
		StringTokenizer obj = new StringTokenizer(str," ");
		
		for(int i=0;i<=3;i++){
			arr[i] =Integer.parseInt(obj.nextToken());
		}
		
		for(int i=0;i<=3;i++)
			System.out.println(arr[i]+" ");
			System.out.println("After For Loop");

	}
}
