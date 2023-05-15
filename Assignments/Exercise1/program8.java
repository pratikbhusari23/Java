/*8.Given an array of integers nums and an integer target, return index of the two
numbers such that they add up to the target.
Input:
array = [3,6,16,15], target = 9
Output:
[0,1]

*/

import java.io.*;

class program8 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array:");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];

        System.out.println("Enter the elements of array:");

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the target:");
        int target = Integer.parseInt(br.readLine());

        int[] arr1 = new int[2];

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] + arr[j] == target) {
                    arr1[0] = i;
                    arr1[1] = j;
                }

            }

        }

        System.out.println("[" + arr1[0] + "," + arr1[1] + "]");

    }
}