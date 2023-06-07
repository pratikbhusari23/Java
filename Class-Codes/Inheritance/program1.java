class Parent{
	
	Parent(){
		System.out.println("In Parent Constructor");
	}

	void ParentProperty(){
		
		System.out.println("Flat,Gold,Car");
	}

}

class Child extends Parent{
	
	Child(){
		
		System.out.println("In Child Constructor");
	}
}

class Client{
	
	public static void  main(String[] args){
		
		Child obj1 = new Child();
		System.out.print("");
		//obj1.ParentProperty();
	}
}
