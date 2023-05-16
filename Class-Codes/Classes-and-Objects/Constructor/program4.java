class Pizza{
	
	int options = 3;

	void Dominoes(){
		System.out.println("150 only !");
	}
	
	void PizzaHut(){
		
		System.out.println("300 only !");
	}
	
	void Ovenstory(){
		
		System.out.println("400 only !");
	}

	public static void main(String[] pratik){
		
		Pizza obj = new Pizza();

		obj.Dominoes();
		obj.Ovenstory();
		obj.PizzaHut();

		System.out.println(obj.options);
	}
}
