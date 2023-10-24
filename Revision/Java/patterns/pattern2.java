/*
 
        Pattern for N = 4
        4444
        4444
        4444
        4444
 */

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int temp=N;

		while(N>0){

			int j=1;

			while(j<=temp){

				System.out.print(temp);
				j++;
			}
			System.out.println();
			N--;
		}
		
	}
}
