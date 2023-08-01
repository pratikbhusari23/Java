class Parent{
	
	void m1(){
		
		System.out.println("Parent");
	}

	void m2(){
		System.out.println("Parent m2");
	}
}
class Child extends Parent{
	
	void m1(){
		
		System.out.println("Child");
	}
}



class Demo{
	
	public static void main(String[] args){
		
		Parent p = new Child();
		p.m1();
		p.m2();
	}
}
