class Parent{
	
	Parent(){
		System.out.println("Parent Constructor");
	}

	void Property(){
		System.out.println("Home , car , gold");
	}

	void marry(){
		
		System.out.println("Kiara Advani");
	}
}
class Child extends Parent{
	
	Child(){
		System.out.println("Child Constructor");
	}

	void marry(){
		System.out.println("Kriti Sanon");
	}

}

class Client{
	public static void main(String[] args){
		
		Child obj = new Child();
		obj.Property();
		obj.marry();
		
	
	}
}
/*

Parent Constructor
Child Constructor
Home , car , gold
Kriti Sanon

 */
