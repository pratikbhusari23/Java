class Demo{
	
	public static int fact(int num){

		if(num==1 || num==0){
			return 1;
		}
		int fact_nm1 = fact(num-1);
		int fact_n = num *fact_nm1;
		return fact_n;
	}
	public static void main(String[] args){
		
		System.out.println(fact(5));
	}
}
