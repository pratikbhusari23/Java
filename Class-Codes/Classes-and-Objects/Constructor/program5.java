class Demo{
	
	int x=10;	//if non static cannot print above main function
	static int y=20;	// if static ,can print above main function using { } static block

	void display(){
		
	//	System.out.println(x+y);
		System.out.println(x+"=x");
	}
	
	{	
	
	//	System.out.println(x);	
		System.out.println(y);	

	}
	public static void main(String[] args){
		
		Demo obj = new Demo();

	//	System.out.println(x);
		System.out.println(y);
		obj.display();
	}
}
