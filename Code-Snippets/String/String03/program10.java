class Pratik{
	
	public static void main(String[] args){

		StringBuffer sbvar1 = new StringBuffer("Core2web");

		long lvar1 = System.identityHashCode(sbvar1);
		
		sbvar1.append( "technologies");

		long lvar2 = System.identityHashCode(sbvar1);


		if(lvar1 ==lvar2)
			System.out.println("True");
		else 
			System.out.println("False");

	}
}

