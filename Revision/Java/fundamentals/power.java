import java.util.Scanner;

public class power {
    
        public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();

        if(y==0){
            System.out.println("1");
            return;
        }
        if(x==0){
              System.out.println("0");
            return;
        }
        int temp =1;
        while(y>0){
    
            temp = temp*x;
            y--;
        }
        System.out.println(temp);
    }
}
