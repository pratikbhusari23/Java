class Demo{
	
	public static void main(String[] args){
		
		String s1 = "A";
		s1 = s1.concat("B");

		String s2 = "C";
		s1=s1.concat(s2);

		s1.replace('C','D');
		s1=s1.concat(s2);

		System.out.println(s1);
	
	}
}
