import java.util.Scanner;

public class Salary {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double basicSalary = sc.nextDouble();
        char grade = sc.next().charAt(0);

        double hra = 0.20 * basicSalary;
        double da = 0.50 * basicSalary;

        double allow;
        if(grade=='A'){
            allow=1700;
        }else if(grade=='B'){
            allow=1500;
        }else{
            allow=1300;
        }
        double pf = 0.11 * basicSalary;


        int totalSalary = (int) Math.round(basicSalary + hra + da + allow - pf);

        System.out.println(totalSalary);
        System.out.println(basicSalary + " "+ hra + " "+da + " "+ allow + " "+ pf);
    }
}
