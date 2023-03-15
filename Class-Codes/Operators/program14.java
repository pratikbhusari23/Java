class Unary{

	
	public static void main(String[] args){
		
		int x=10;
		int y=10;

		int ans=++x + y++ + x++;

		System.out.println(x);		//12
		System.out.println(y);		//11
		System.out.println(ans);	//32
	
	}

}
