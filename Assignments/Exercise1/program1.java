/* 
1.Write a Program to Print following Pattern.
note: take rows from user.
A C E G
B D F
C E

*/

import java.io.*;

class program1{

    public static void main(String[] args) throws IOException{
    
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter No of Rows :");
        int rows = Integer.parseInt(br.readLine());
        
        System.out.println();
        
        

        for(int i=1 ; i<=rows ; i++){
            char num =(char)(i+64);
            for(int j=rows ; j>=i ; j--){
                
                System.out.print(num+" ");
                num=(char)(num+2);
            }

            System.out.println();
        
        }
    
    }
}