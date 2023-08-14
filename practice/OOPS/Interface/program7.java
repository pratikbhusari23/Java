interface left{
	
	void m1();
	void m2();

}
abstract class right implements left{
	
	public void m1(){}
}

class Demo extends right{
	

	public void m2(){}
	public static void main(String[] args){
	
	}
}
