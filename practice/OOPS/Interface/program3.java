interface left{
	
	public void m1();

}
interface right{
	
	public void m1();
}

 class Demo implements left , right{
	
	public void m1(){};
	public static void main(String[] args){
		
		Demo obj = new Demo();
		obj.m1();
	}
}
