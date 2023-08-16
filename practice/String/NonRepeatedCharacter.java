//Find the first non-repeated character in a String.

import java.io.*;

public class NonRepeatedCharacter{

    public static void main(String[] pratik)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string:");
        String str = br.readLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("First non-repeated character is: " + str.charAt(i));
                break;
            }
        }

    }
}