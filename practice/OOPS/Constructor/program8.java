class Parent{
	
	String a= "Parent";
}
class Child extends Parent{
	
	String s="Child";

	static void m1(){	
		System.out.println(s);
		System.out.println(this.s);
	}
	
}
class Client{
	
	public static void main(String[] args){
		
		Child obj = new Child();
		obj.m1();
	}
}
