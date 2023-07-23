class Demo{
	
	static int fun(int n){
		
		if(n==0){
			return 1;
		}
		return fun(n-1)*n;
	}
	public static void main(String[] args){
		
		System.out.println(fun(5));
	}
}
