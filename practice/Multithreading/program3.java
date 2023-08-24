class Mythread extends Thread{
	
	public void run(){
		for(int i=0 ; i<10 ;i++){
			System.out.println("Child Thread");
		//	Thread.yield();
		}
	}
}
class ThreadYieldDemo{
	
	public static void main(String[] args){
		
		Mythread k = new Mythread();
		k.start();

		for(int i=0 ; i<10 ; i++){
			System.out.println("Main Thread");
		}
	}
}
