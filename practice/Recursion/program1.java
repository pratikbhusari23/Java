class Numbers{
	
	static void print(int n,int m){
		
		
		if(n>m){
			return ;
		}
		System.out.println(n);
		print(++n,m);
	}
	public static void main(String[] args){
		
		print(1,5);
	}
}
