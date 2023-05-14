/*

0121. Binary Equivalent

A binary number is given in form of string Salong with an integer Y.

The following cryptographic operation is performed on the binary string S: 1. The decimal value of S is calculated

and stored in an Integer. 2. This integer is then divided by the

given integer Y.

3. The remainder of the division is returned in the form of its binary

equivalent.

Write a program to perform the above

cryptographic operation.

Note:

A binary number is a set of 2 digits only, Le 0 and 1.

Eg. 101, 111. 100, 1010101

Function Description In the provided code snippet.

implement the provided cryptographicOP(...) method using the variables to print the output. You can write your code in the space below the phrase "WRITE YOUR LOGIC HERE

There will be multiple test cases running so the Input and Output should match exactly as provided.

Input Format

The first line contains a string, S. denoting the binary input.

The next line contains the integer Y.

16

17

18

19

Sample Input

100-- denotes string S 2- denotes Y

Output Format

The output contains an integer, denoting the binary equivalent of string S.

Input

Sample Output


Sample Output

0

Explanation

The decimal equivalent of 100 is 4. 4 divided by 2 >> gives the remainder

0.

The binary equivalent of 0 is 0. Hence, the output is 0.

 */
import java.util.Scanner;

public class Mehul {

    public static int efficiency(String S, int Y) {
        int decimal = 0;
        for (int i = 0; i < S.length(); i++) {
            decimal = decimal << 1 | (S.charAt(i) - '0');
        }
        int result = decimal % Y;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int Y = sc.nextInt();
        System.out.println(efficiency(S, Y));
        sc.close();
    }
}
