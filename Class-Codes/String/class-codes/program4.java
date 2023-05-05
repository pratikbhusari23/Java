class StringDemo{
	
	public static void main(String[] Demo){
		
		String str1="Kanha";                //100
		String str2=str1;                   //100
		String str3 = new String(str2);

		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}

	/*

		str1="kanha";  and 
		str2 = str1  kela ki toh new object nhi banvat , it just refers to the address of str1 to str2


	   */




}
