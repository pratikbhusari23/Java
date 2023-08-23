class Mythread extends Thread{
	public void run(){
		System.out.println("This line is executed by thread : "+Thread.currentThread().getName());
	}
}

class Demo{
	
	public static void main(String[]args){
	
		System.out.println(Thread.currentThread().getName());
		Mythread t = new Mythread();
		t.start();
		Mythread t1=new Mythread();
		t1.start();
		System.out.println(t.getName());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		Thread.currentThread().setName("pratik");
		System.out.println(Thread.currentThread().getName());				

	
	}
}
