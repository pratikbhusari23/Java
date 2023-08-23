class Mythread extends Thread{}
class Demo{
	
	public static void main(String[]args){
	
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());

		Mythread t = new Mythread();
		System.out.println(t.getPriority());
		

	
	}
}
