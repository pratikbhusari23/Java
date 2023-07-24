/*
you are given integer n(which are no of rows )and start value start , print 2*n line in followig manner                                         3
3
4 4
5 5 5 
6 6 6 6
5 5 5
4 4 
3
 */


import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        sc.close();

        // Print upper half of the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
            }
            System.out.println();
            start++;
        }

        // Print lower half of the pattern
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(start - 1 + " ");
            }
            System.out.println();
            start--;
        }
    }
}
