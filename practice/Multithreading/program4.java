class Mythread extends Thread{
	
	public void run(){
		for(int i=0 ; i<10 ; i++){
			
			System.out.println("Child Thread");

			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				
			}

		
		}
	}
}
class ThreadJoinDemo{
	
	public static void main(String[] args) throws InterruptedException{
		Mythread t = new  Mythread();
		t.start();
		t.join();

		for(int i=0 ; i<10; i++){
			
			System.out.println("Main Thread");
		}
	}
}
