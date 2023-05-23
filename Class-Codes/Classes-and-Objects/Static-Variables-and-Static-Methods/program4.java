class Demo{
	
	int x=10;
	static int y=10;

	static{
		Demo obj = new Demo();

		System.out.println("Static Block 1");
	
		System.out.println(obj.x);
	}
	
	public static void main(String[] pratik){
		
		System.out.println("Main Method");
		Demo obj2 = new Demo();
		System.out.println(obj2.x);
		
	}
	static {
		

		System.out.println("Static block 2");
		System.out.println(y);

	}
	static {
		

		System.out.println("Static block 3");
		System.out.println(y);

	}
}
