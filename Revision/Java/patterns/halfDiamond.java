import java.util.Scanner;

public class halfDiamond {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();


        if(N==0){
            System.out.println("*");
        }

        int i,j,k,p,d;

        i=1;

        while(i<=N+1){

            System.out.print("*");

            j=1;

            while(j<i){
                System.out.print(j);
                j++;
            }

            j=i-2;

            while(j>0){
                System.out.print(j);
                j--;
            }

            if(i!=1){
                System.out.print("*");
            }

            System.out.println();
            i++;
        }

        p=N;

        i=1;

        while(i<=N){

            System.out.print("*");

            j=1;

            while(j<p){
                System.out.print(j);
                j++;
            }

            d=p-2;

            while(d>0){
                System.out.print(d);
                d--;
            }

            p--;

            if(i!=N){
                System.out.print("*");
            }
            
            System.out.println();
            i++;

        }
    }
}
