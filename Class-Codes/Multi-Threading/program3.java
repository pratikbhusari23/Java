class MyRunnable implements Runnable{
	
	public void run(){
		for(int i=0 ; i<10 ; i++){
			System.out.println("Child Thread");
		}
	}
}
class ThreadDemo{
	
	public static void main(String[] args){
		
		MyRunnable obj = new MyRunnable();
		Thread t = new Thread();
		t.start();

		for(int i=0 ; i<10 ; i++){
			System.out.println("In main");
		}

	}
}
