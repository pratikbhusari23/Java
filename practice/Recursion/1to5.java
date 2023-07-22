class Demo{
	
	static void fun(int start , int end){
		
		if(start>end){
			return;
		}
		System.out.println(start);
		fun(++start,end);
	}
	public static void main(String[] args){
		
		int start =1 ;
		int end = 5;

		fun(start,end);
	}
}
