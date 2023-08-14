interface left{
	
//	public void m1();
	int x=10;
}
interface right{
	
//	public void m1();
}

class Demo implements left , right{
	
	public static void main(String[] args){
		
		x=777;
		System.out.println(x);
	}
}

