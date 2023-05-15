/*

4.Write a program to find maximum and minimum numbers from an array
note: take array from user.
Input:
N = 6
Arr[] = {3,,34, 1, 156,200, 100}
Output:
min = 1, max = 200

 */

import java.io.*;

class program4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array:");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];

        System.out.println("Enter the elements of array:");

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < size; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);

    }
}