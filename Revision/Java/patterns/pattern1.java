/*
 Pattern for N = 3
        ###
        ###
        ###
 */

import java.util.Scanner;

public class pattern1 {
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cols=N;

		while(N>0){
			int j=1;

			while(j<=cols){

				System.out.print("#");
				j++;

			}
			System.out.println();
			N--;
		}
		 
	}
    
}
