class Demo{
	
	static int fun(int num , int pow){
		
		if(pow==0){
			return 1;
		}
		return fun(num,pow-1)*num;
	}
	public static void main(String[] args){
		
		System.out.println(fun(5,3));
	}
}
