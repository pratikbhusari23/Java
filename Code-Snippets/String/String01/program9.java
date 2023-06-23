class Core2web{

	public static void main(String[] args){
		
		String svar1 = "This is a String"	;
		String svar2 = "a String";
		String svar3 = "This is"+svar2;

		if(System.identityHashCode(svar1)==System.identityHashCode(svar3)){

			System.out.println("Equal");
		}
		else {
			
			System.out.println("Not Equal");
		}

	}
}
