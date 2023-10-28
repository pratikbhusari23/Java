import java.util.Scanner;
public class DecimalToBinary {
    
    public static void main(String[] args) {
		// Write your code here

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long binary =0;
		long base =1;


		for(int decimal=N ; decimal>0 ; decimal/=2){
			
			int rem = decimal % 2;
            System.out.println("rem : "+ rem);

			binary = binary + rem *base;
            System.out.println("binary : " + binary);
			base *=10;

		}
		System.out.println(binary);
	}
}
