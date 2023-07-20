class Mythread extends Thread{
	
	public void run(){

		System.out.println(Thread.currentThread().getName());
		for(int i=0 ; i<10 ; i++){
			System.out.println("In Run");

			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
			}
		}
	}
}
class ThreadDemo{
	
	public static void main(String[] args) throws InterruptedException{
		
		Mythread obj = new Mythread();
		obj.start();

		for(int i=0 ; i<10 ; i++){
			System.out.println("In main");
			Thread.sleep(1000);
		}
	}
}
