
/* 
6.Write a Program to reverse a given String.
Input String:
Ajay Bhosle
Output String:
elsohB yajA

*/

import java.io.*;

class program6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string:");
        String str = br.readLine();

        String str1 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }

        System.out.println("Reversed string is: " + str1);

    }
    
}