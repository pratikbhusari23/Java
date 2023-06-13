/*Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and print even numbers from the array.
Input:
n=5
Enter elements in the array:
1
2
3
4
5
Output:
2
4

*/

import java.io.*;

class Program3 {
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
    
    for(int i=0;i<arr.length;i++) {
        if(arr[i]%2==0) {
            System.out.println(arr[i]);
        }
    }
    }
}