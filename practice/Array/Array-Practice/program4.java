/*

Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and find the max number from the array

Input:
n=5
Enter elements in the array:
2
3
6
9
5
Output:
9

 */

import java.io.*;

class program4 {

    public static void main(String[] args) throws IOException{
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter the size of array");
    int n = Integer.parseInt(br.readLine());
    
    int arr[] = new int[n];
    
    System.out.println("Enter the elements of array");
    
    for(int i=0;i<arr.length;i++) {
        arr[i]=Integer.parseInt(br.readLine());
    }
    
    System.out.println("Elements of array are : ");
    
    int max = arr[0];
    
    for(int i=0;i<arr.length;i++) {
        if(arr[i]>max) {
            max = arr[i];
        }
    }
    
    System.out.println("Maximum number from the array is : "+max);
    }
    
}
