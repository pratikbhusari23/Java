class Demo{
		
	static int fibo(int num){
		
		if(num<2){
			return num;
		}
		
		return fibo(num-1)+fibo(num-2);
	
	}
	public static void main(String[] args){
		
		int ans =fibo(46);
		System.out.println(ans);
	}
}
