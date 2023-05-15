/* 
5.Write a program to remove the occurrences of a specified letter Character.
Input :
Java Program
character to remove : a
Output :
 Jv Progrm

 */

import java.io.*;

class program5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string:");
        String str = br.readLine();

        System.out.println("Enter the character to remove:");
        char ch = (char) br.read();

        String str1 = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ch) {
                str1 = str1 + str.charAt(i);
            }

        }

        System.out.println("String after removing the character is: " + str1);

    }
}