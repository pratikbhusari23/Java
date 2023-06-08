class Parent{
	
	Parent(){
		System.out.println("Parent Construtor");
	}

	void fun(){
		System.out.println("In parent fun");
	}
}
class Child extends Parent{
	
	Child(){
		System.out.println("Child Construtor");
	}

	void fun(int x){
		System.out.println("In Child fun");
	}

}

class Client{
	public static void main(String[] args){
		
		Parent obj1 = new Child();
//		obj1.fun(5);    error - required void , found int
	}
}
