class Parent{
	
	public void m1(){
		
		System.out.println("Parent");
	}
}
class Child extends Parent{
	
	public void m2(){
		
		System.out.println("Child");
	}
}

class Demo{
	
	public static void main(String[] args){
		
		Child obj = new Child();
		obj.m2();
	}
}

