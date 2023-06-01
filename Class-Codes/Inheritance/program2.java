class Parent{
	
	Parent(){
		
		System.out.println(this);
		//System.out.println("In Parent Constructor");
	}

	void ParentProperty(){
		
		System.out.println("Flat , Car , Gold");
	}
}

class Child extends Parent{
	
	Child(){
		
		System.out.println(this);
	//	System.out.println("In Child Constructor");
	}
}

class Client{
	
	public static void main(String[] args){
		
		Parent Obj1 = new Parent();
		Child  Obj2 = new Child();
		Parent Obj3 = new Child();
	}
}
/*
		Parent@6bc7c054
		In Parent Constructor
		Child@232204a1
		In Parent Constructor
		Child@232204a1
		In Child Constructor
		Child@4aa298b7
		In Parent Constructor
		Child@4aa298b7
		In Child Constructorystem.out.println(this);
*/
