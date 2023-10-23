import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // int i=2;
        // Boolean isPrime = true;

        // if(n==2){
        //     System.out.println("Prime");
        //     return;
        // }
        // if(n%2==0){
        //     isPrime=false;
        // }

        // while(i<=n/2){

        //     if(n%i==0){
        //             isPrime=false;
        //             break;
        //     }
        //     i++;
        // }


        // int j=3;

        // while(isPrime && j<n){

        //     isPrime = !(n%j==0);
        //     j+=2;
        // }

        // if(isPrime){
        //     System.out.println("Prime");;
        // }else{
        //     System.out.println("Not Prime");
        // }

        int i=10;
        while((i=i-1)>0)
        {
            System.out.print(i);
            if(i%5==0)
                return;
        }
    }
}
