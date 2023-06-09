class Demo{
	
	void fun(int x , float y){
		
		System.out.println("int Float para");
	}

	void fun(float x , int y){
		System.out.println("Float int para");
	}
}

class Client{
	
	public static void main(String[] args){
		
		Demo obj = new Demo();
		obj.fun(10.5f,10);
	}
}
