import java.util.Scanner;

public class oddSquare {
    
    	public static void main(String[] args) {
		// Write your code here

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int temp=N;
	    int i=1;
		while(N>0){

			int j=i*2-1;
            int k=1;
		
			while(k<=N){
				System.out.print(j);
				j+=2;
				k++;
			}
			j=1;
			while(k<=temp){
				System.out.print(j);
				k++;
				j+=2;
			}
			System.out.println();
			N--;
            i++;
		}
		
	}
}
