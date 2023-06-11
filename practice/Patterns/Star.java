/*

        *
      * * *
    * * * * *
      * * *
        *

*/
import java.io.*;

class Pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows");
        int rows = Integer.parseInt(br.readLine());

        int space = rows - 1;
        int stars = 1;

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;

            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            stars += 2;

            System.out.println();
        }

        space = 1;
        stars = 2 * (rows - 1) - 1;

        // Lower half of the diamond
        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;

            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            stars -= 2;

            System.out.println();
        }
    }
}
