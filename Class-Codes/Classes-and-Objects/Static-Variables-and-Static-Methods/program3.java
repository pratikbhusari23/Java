class Demo{
	
	int x=10;
	static{
		Demo obj = new Demo();

		System.out.println("Static Block");
	
		System.out.println(obj.x);
	}
	
	public static void main(String[] pratik){
		
		System.out.println("Main Method");
	}
}
