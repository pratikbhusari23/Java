import java.util.Scanner;

public class AverageMarks {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

		char name = sc.next().charAt(0);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();

		System.out.print(name + "\n"+ (m1+m2+m3)/3);

		
    }
}
