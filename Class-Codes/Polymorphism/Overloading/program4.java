class Demo{
	
	void fun(String str){
		
		System.out.println("String");
	}
	void fun(StringBuffer str1){
		
		System.out.println("Strin");
	}
}

class Client{
	
	public static void main(String[] args){
		
		Demo obj=new Demo();
		obj.fun("Core2web");
		obj.fun(new StringBuffer("Core2web"));
		obj.fun(null);
	}
}
