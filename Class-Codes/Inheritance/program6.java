
class Demo{

	int fun(int x){
		
		System.out.println(x);
	}
	float fun(int y){
		
		System.out.println(y);
	}
}
class Client{
	
	public static void main(String[] args){
		
		Demo obj= new Demo();
		obj.fun(10);
	}
}
/*

program6.java:8: error: method fun(int) is already defined in class Demo
        float fun(int y){
              ^
1 error

 */