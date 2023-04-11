import java.io.*  ;
import java.util.*  ;

class IPL{
	
	public static void main(String[] pratik) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Society name,wing,flatno");

		String info=br.readLine();
		System.out.println(info);
		StringTokenizer obj=new StringTokenizer(info,",");

		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		String token3 = obj.nextToken();

		System.out.println("Society="+token1);
		System.out.println("Wing="+token2);
		System.out.println("Flat="+token3);

	}

}
