
import java.util.Scanner;

public class SimpleInterest {
    
    public static void main(String[] args) {
        
    
    	Scanner sc = new Scanner(System.in);

		int principalAmount = sc.nextInt();
		double roi = sc.nextDouble();
		int time = sc.nextInt();

		long simpleInterest = Math.round(principalAmount*time*roi)/100 ;

		System.out.println(simpleInterest);
    }
}
