import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
		// Write your code here

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num=0;
		int j=1;
		for(int i=N ; i>0 ; i/=10 ){

			int y=i%10;
			
			if(y==1){
				num=num + j;
			}
			j=j*2;
		}
		System.out.println(num);
	}
}
