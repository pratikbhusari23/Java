class Demo{
	
	public static void main(String[]args){
	
		System.out.println("Start1");
	 	
		try{
			
			System.out.println(10/0);

		}catch(ArithmeticException e){
			
			System.out.println(10/2);
		}
		System.out.println("str2");
	}
}
