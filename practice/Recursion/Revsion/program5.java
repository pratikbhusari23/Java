class Demo{
	
	public static void fibo(int num){
		
		if(num<=1){
			return;
		}

		fibo(num-1)+fibo(num-2); 
		System.out.println(num);
	}	

	public static void main(String[] args){
		
		fibo(8);	
			

	}
}
