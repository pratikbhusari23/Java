public class Demo1{

	int var1=10;

	public static void main(String[] args){
		
		Demo1 obj = new Demo1();
		System.out.println(++obj.var1);
	}
}
class Main{
	
	public static void main(String[] args){
		
		System.out.println("In main");
		Demo1 obj = new Demo1();

		System.out.println(++obj.var1);
	}
}
