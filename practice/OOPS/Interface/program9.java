interface left{
	
	int x=777;

}
interface right{
	
	int x=888;
}

class Demo implements left,right{
	
	public static void main(String[] args){
		
		System.out.println(left.x);
		System.out.println(right.x);
	}
}
