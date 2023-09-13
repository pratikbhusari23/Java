class Demo{
	
	public static void printNum(int num){
		
		if(num==0){
			return;
		}
		System.out.println(num);
		printNum(--num);

	}
	public static void main(String[] args){
		
		printNum(5);
	}
}
