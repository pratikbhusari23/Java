package OperatorsAndForLoop;

import java.util.Scanner;

public class maximumThreeDigitNoByRemovingADisgit {
    
    public static int max_number(int n) {

        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        int maxNum = 0;
        int i = 1;
        while (n / i > 0) {
            int newNum = (n / (i * 10)) * i + n % i;
            i = i * 10;
            if (maxNum < newNum) {
                maxNum = newNum;
            }
        }
        return maxNum;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(maximumThreeDigitNoByRemovingADisgit.max_number(n));
        s.close();

    }
}

