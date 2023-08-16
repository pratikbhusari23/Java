//Reverse a String.

import java.io.*;

class Reverse {

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