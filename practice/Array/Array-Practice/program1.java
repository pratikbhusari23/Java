/*

1. Program 1:
Write a program to create an array of 5 integer elements.
And print all 5 elements from an array (take hardcoded values in the array)
Output :
1
2
3
4
5

*/
import java.io.*;

class Program1 {
    public static void main(String[] args) throws IOException{
        
	int arr[] = new int[5];
  
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

	
        for(int i=0;i<arr.length;i++) {
	    arr[i]=Integer.parseInt(br.readLine());
            System.out.println(arr[i]);
        }
    }
}
