class Demo{
	
	int x=10;

	static{

		Demo obj = new Demo();

		System.out.println("Static Block");
	
		System.out.println(obj.x);
		int y=20;
		System.out.println(y);
	
	}
	
	static {
		fun();
	}
	
	static void fun(){
		
		System.out.println(2+3);
	
	}
	
	public static void main(String[] pratik){
		
		System.out.println("Main Method");
	
	}

	static {
		fun();

	}
}
