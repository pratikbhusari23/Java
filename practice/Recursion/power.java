class Demo{
	
	public static int power(int n , int m){
		
		if(n==0 ){
			return 0;
		}
		if(m==0){
			return 1;
		}

		return power(n ,m-1)*n;

	}
	public static void main(String[] args){
		
		System.out.println(power(2,5));
	}
}
