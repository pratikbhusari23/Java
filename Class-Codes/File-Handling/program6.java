import java.io.*;
class Demo{
	
	public static void main(String[] args)throws IOException{
		
		FileWriter fw = new FileWriter("abcdef.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();

		char[] ch = {'a','b','c','d'};

		bw.write(ch);
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.write("World");
		
	}
}
