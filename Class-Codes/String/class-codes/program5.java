class StringDemo{

	public static void main(String[] args){
	
		
		String str1="Pratik";
		String str2 = "Bhusari";

		System.out.println(str1+str2);

		String str3 = "PratikBhusari";
		String str4 = str1 + str2 ;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}

	//      str3 = "PratikBhusari"
	//      str4 = str1 + str2
	//
	//      The Memory location of this two variables are different , str3 is on scp and str4 is on heap ,
	//
	//      when we concat 2 strings it creates new object of heap

}
