import java.util.Scanner;
public class diamond{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int i=1;

        

        while (i <= N/2+1) {
            int j = i;
            while (j <= N/2) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <=2 * i -1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

        i = N /2;
        while (i >= 1) {
            int j = 1;
            while (j <= N/2+1-i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }
      
        
    }
}