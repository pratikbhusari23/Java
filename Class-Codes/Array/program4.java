import java.io.*;
import java.util.*;

public class program4 {

    public static void main(String[] args) throws IOException{
        

        int arr[] = new int[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter array String : ");
	String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str," ");

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
	System.out.println();
    }
}
