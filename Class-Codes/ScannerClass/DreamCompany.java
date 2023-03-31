import java.util.Scanner;

class DreamCompany{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Company name");

		String name=obj.next();
		System.out.println("Excpected salary");
		float salary=obj.nextFloat();

		System.out.println(name);
		System.out.println(salary);
	}
}
