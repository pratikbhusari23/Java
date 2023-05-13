class Core2web{
	
	Core2web(){
		System.out.println("In Core2web");

	}

	public static void main(String[] args){
		
		System.out.println("In main");
		Core2web obj = new Core2web();
		obj.fun();
	}

	void fun(){
		
		System.out.println("In fun");	
		Core2web obj = new Core2web();
	}
}

/*

   In main
   in Core2web
   in fun
   in Core2web

   */
