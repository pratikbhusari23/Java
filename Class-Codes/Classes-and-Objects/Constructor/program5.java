class Demo{
	
	static int x=10;
	static int y=20;

	void display(){
		
		System.out.println(x+y);

	}
	

	public static void main(String[] args){
		
		Demo obj = new Demo();

		System.out.println(x);
		System.out.println(y);
		obj.display();
	}
}
