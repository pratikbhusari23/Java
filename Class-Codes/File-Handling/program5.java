import java.io.*;
class Demo{
	
	public static void main(String[] args){
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("abcd.txt"));
		bw.write(100);
		bw.newLine();
	}
}
