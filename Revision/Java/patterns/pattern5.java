/*
 
    Note: Print spaces between the numbers.
        Pattern for N = 5
        5 
        5 4 
        5 4 3 
        5 4 3 2 
        5 4 3 2 1
 */

import java.util.Scanner;

public class pattern5 {
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i=1;


		while(i<=N){

			int j=N;
			int k=1;

			while(k<=i){

				System.out.print(j+" ");
				j--;
				k++;
			}
			System.out.println();
			i++;

		}
		 
	}
}
