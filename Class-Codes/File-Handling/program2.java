import java.io.*;
class Demo{
	
	public static void main(String[] args){
		
		File f = new File("Pratik");
		f.mkdir();

		String[] s = f.list();

		for(int i=0 ; i<s.length ; i++){
			
			System.out.println(s[i]);
		}

		File f1 = new File("laukik");
		f1.delete();
	}
}
