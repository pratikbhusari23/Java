class Demo{
	
	public static void main(String[] args){
	
		String s1 = "durga";
		String s2 = s1.toString();
		String s3 = s1.toLowerCase();
		String s4 = s1.toUpperCase();

		System.out.println(s1==s2);	//True
		System.out.println(s1==s3);	//True
		System.out.println(s1==s4);	//false
	}
}
