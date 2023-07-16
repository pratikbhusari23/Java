class Test{
	
	public void m1(){
		System.out.println("no-args");
	}
	public int  m1(int x){
		System.out.println("int");
		return 2;
	}
	public void m1(double x){
		System.out.println("long");
	}

	public static void main(String[] args){
		
		Test obj = new Test();
		obj.m1();
		System.out.println(obj.m1(10));
		obj.m1(10.5);
	}
}
