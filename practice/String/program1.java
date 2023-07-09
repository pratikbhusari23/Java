import java.io.*;

class Demo{
	
	public static void main(String[] args) throws IOException{
		
		StringBuffer sb1 = new StringBuffer("Hello");

		System.out.println(System.identityHashCode(sb1));
		
		sb1.append("world");
		System.out.println(System.identityHashCode(sb1));
	}
}
