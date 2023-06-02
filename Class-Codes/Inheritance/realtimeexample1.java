class ICC{

	ICC(){
		
		System.out.println("An ICC Event");
	}
	void Rules(){
		
		System.out.println("Rules");
	}
}

class WTC extends ICC{

	WTC(){
			
		System.out.println("World Test Championship Final");
		System.out.println("IND vs AUS");
	}
}

class Fans{
	
	public static void main(String[] args){
		
		
		ICC obj1 = new ICC();
		obj1.Rules();
		WTC obj2 = new WTC();
		ICC obj3 = new WTC();
	}

}
