/*

3.Write a Program that prints a series of Prime numbers ranging
between 1 to 100.
Output: 1 2 3 5 . . .

*/ 

import java.io.*;

class program3{
        
        public static void main(String[] args){
            
            int i,j;
            for(i=1;i<=100;i++){
                for(j=2;j<i;j++){
                    if(i%j==0){
                        break;
                    }
                }
                if(i==j){
                    System.out.print(i+" ");
                }
            }
        }
    }
