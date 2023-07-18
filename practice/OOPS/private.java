class Parent{
	
	final void m1(){
		System.out.println("In Parent");	
	}
}
class Child extends Parent{
	
	final	void m1(){
	
	}
}


class Demo{
	
	public static void main(String[] args){
		
	Child obj = new Child();
	obj.m1();	

	}
}
