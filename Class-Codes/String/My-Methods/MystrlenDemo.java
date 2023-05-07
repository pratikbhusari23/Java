class MystrlenDemo{

	static int mystrlen(String str){
		
		char arr[] = str.toCharArray();

		return arr.length;
			
	}
		
	public static void main(String[] pratik){
		
		
		String str1 = "PratikBhusari"; 
		System.out.println(str1.length());

		int len = mystrlen(str1);
		System.out.println(len);

	
	}
}
