class Demo{
	
	public static void power(int n){
		
		if(n<0 ){
			return;
		}
		if(n==0){
			System.out.println(n);
			return ;
		}
		power(n-1);
		System.out.println(n+" ");

		return ;

	}
	public static void main(String[] args){
		
		power(5);
	}
}
