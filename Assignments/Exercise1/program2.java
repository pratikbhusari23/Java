/*
 
2.Write a Program to Print following Pattern.
note: take rows from user.

E a D b
  c C d
    B e
      f
 */

 import java.io.*;

 class program2 {
 
     public static void main(String[] args) throws IOException {
     
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println("Enter the number of rows:");
         int rows = Integer.parseInt(br.readLine());
         
         System.out.println();
         
         /*
          E a D b
            c C d
              B e
                f
          */
         int temp = 1;
         int m = 0;
         int n = rows;
         
         for (int i = 1; i <= rows; i++) {
 
             for (int j = 1; j < i; j++) {
                 System.out.print("  ");
             }
 
             for (int k = rows; k >= i; k--) {

                if(i%2!=0){
                    if (temp % 2 != 0) {
                        System.out.print((char)(n + 65) + " ");
                        n--;
                        temp++;
                    } 
                    else {
                        System.out.print((char)(m + 97) + " ");
                        temp++;
                        m++;
                    }
                }
                else{
                    if (temp % 2 != 0) {
                        System.out.print((char)(m + 97) + " ");
                        temp++;
                        m++;
                    } 
                    else {
                        System.out.print((char)(n + 65) + " ");
                        n--;
                        temp++;
                    }
                }
            }
             System.out.println();

        }
    }
}