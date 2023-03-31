import java.io.*;


class program1 {

	public static void main(String pratik[]) throws Exception{
	
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Name");
		String name = br.readLine();

		System.out.println(name);

		System.out.println("Enter Age");
		int age = Integer.parseInt(br.readLine());

		System.out.println(age);
	}
}
