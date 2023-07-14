
import java.util.*;
class Demo{
		
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your City Name");
		String city=sc.nextLine().toLowerCase().trim();
			
		if(city.equals("pune")){
			System.out.println(" Namskar");
		}
		else if(city.equals("mumbai")){
			System.out.println("Hello");
		}
		else if(city.equals("sangamner")){
			System.out.println("Ram Ram !");
		}
		else {
			System.out.println("Enter Valid City Name");
		}
	}	

}
