class ConstructorDemo{
	
	ConstructorDemo(){
		
		System.out.println("In Constructor");
	}

	void fun(){
		
		ConstructorDemo obj = new ConstructorDemo();
	}

	public static void main(String[] pratik){
		
		ConstructorDemo obj1 = new ConstructorDemo();
		ConstructorDemo obj2 = new ConstructorDemo();

		obj1.fun();
		obj2.fun();
	}

}
