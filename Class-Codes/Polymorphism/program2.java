
class Demo{

	void fun(int x){
		
		System.out.println(x);
	}
	void fun(float y){
		
		System.out.println(y);
	}
}
class Client{
	
	public static void main(String[] args){
		
		Demo obj= new Demo();
		obj.fun(10.5f);
	}
}
