import java.io.*  ;
import java.util.*  ;

class IPL{
	
	public static void main(String[] pratik) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Society name,wing,flatno,price");

		String info=br.readLine();
		System.out.println(info);
		StringTokenizer obj=new StringTokenizer(info,",");

		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		String token3 = obj.nextToken();
		String token4 = obj.nextToken();
		
		char Wing=token2.charAt(0);
		float Price =Float.parseFloat(token4);
		int Flatno =Integer.parseInt(token3);
		String Society=token1;

		System.out.println(Society);
	
		System.out.println(Wing);
		System.out.println(Flatno);
		System.out.println(Price);

	}

}
