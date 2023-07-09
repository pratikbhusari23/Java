import java.io.*;

class Demo{
	
	public static void main(String[] args) throws IOException{
		
		StringBuffer sb1 = new StringBuffer("Hello");

		System.out.println(System.identityHashCode(sb1));
		
		StringBuffer sb2 = new StringBuffer("Hello");
		
		System.out.println(System.identityHashCode(sb1));

		System.out.println(sb1.equals(sb2));
	}
}
