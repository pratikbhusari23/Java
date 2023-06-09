class Parent{
	
	Object fun(){
		
		System.out.println("Parent fun");
		return new Object();
	}
}

class Child extends Parent{
	
	String fun(){
		
		System.out.println("Child fun");
		return "Pratik";
	}
}

class Client{
	
	public static void main(String[] args){
		
		Parent p = new Child();
		p.fun();
	}
}
