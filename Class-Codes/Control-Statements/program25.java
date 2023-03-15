class Divisible{
	
	public static void main(String[] pratik){
		
		int x=15;

		if(x%3==0 && x%5==0){
			System.out.println("Fizz-Bizz");
		}
		else if(x%3==0){
			
			System.out.println("Fizz");
		}
		else if(x%5==0){
		
			System.out.println("Bizz");
		}
		else {
			System.out.println("Not divisible by Both");
		}

	}
}
