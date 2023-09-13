class Demo{
	
	public static int sumOfN(int num, int sum){
		
		if(num==0){
			return sum;
		}
		sum+=num;
		return sumOfN(--num, sum);
	}

	public static void main(String[] args){
		
		System.out.println(sumOfN(5,0));		

	}
}
