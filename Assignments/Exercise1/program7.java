/*

7.Write a Program that takes a number as input from the user
and prints only those digits from that number, which are perfect
divisors in the actual number.
Input: 124

Hint : 124℅4
       124℅2
       124℅1

Output: The Perfect Divisor Digits from the Number 124 are 1 2 4

*/

import java.io.*;

class program7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number:");
        int num = Integer.parseInt(br.readLine());

        System.out.print("The Perfect Divisor Digits from the Number " + num + " are ");

        int temp = num;

        while (temp > 0) {

            int digit = temp % 10;

            if (num % digit == 0) {
                System.out.print(digit + " ");
            }

            temp = temp / 10;
        }

    }
}