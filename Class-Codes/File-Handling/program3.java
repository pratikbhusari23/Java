import java.io.*;
class Demo{
	
	public static void main(String[] args)throws IOException{
		
		FileWriter fw = new FileWriter("abcd.txt",true);
		fw.write(100);
		fw.write("urga");

		char[] ch1 = {'a','b','c'};
		fw.write(ch1);

		
	}
}
