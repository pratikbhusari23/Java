/*
 
    Pattern for N = 4
        1
        22
        333
        4444
 */

import java.util.Scanner;

public class pattern4 {
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i=1;

		while(i<=N){
			int p=i;
			int j=1;

			while(j<=i){

				System.out.print(p);
				j++;

			}
			System.out.println();
			i++;
		}
		
	}
}
