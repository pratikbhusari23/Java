class Demo{
	
	static void fun(int start){
		
		if(start>5){
			return;
		}

		System.out.println(start);
		fun(start+1);
		System.out.println(start);
	}
	public static void main(String[] args){
		
		int start =1 ;
		fun(start);
	}
}
