
class Demo{

	void fun(int x){
		
		System.out.println(x);
	}
	void fun(int y){
		
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
program4.java:8: error: method fun(int) is already defined in class Demo
        void fun(int y){
             ^
1 error

*/
