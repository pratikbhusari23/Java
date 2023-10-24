/*
    Pattern for N = 4
        1
        21
        321
        4321
 */

import java.util.Scanner;

public class pattern6 {

    	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int i=1;

		while(i<=N){

			int j=1;
			int k=i;

			while(j<=i){
				
				System.out.print(k);
				k--;
				j++;

			}
			i++;
			System.out.println();
		}
		
	}
    
}
