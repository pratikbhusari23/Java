import java.io.*;
class Demo{
	
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("abcd.txt");

		int i=fr.read();

		while(i!=-1){
			
			System.out.print((char)i);
			i=fr.read();
		}

		System.out.println();

		char[] ch = new char[2];
		
		File d = new File("abcd.txt");
		FileReader fr = new FileReader(d);
		fr.read(ch);
		for(char ch1 :ch){
			System.out.print(ch1);
		}
	}
}
