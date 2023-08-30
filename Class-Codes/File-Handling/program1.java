import java.io.*;
class Demo{
	
	public static void main(String[] args)throws IOException{
		
		File f = new File("laukik");
		
		f.mkdir();

		File f1 = new File("laukik","pratik.txt");
//		File f1 = new File(f,"demo.txt");
		f1.createNewFile();

	
	}
}
