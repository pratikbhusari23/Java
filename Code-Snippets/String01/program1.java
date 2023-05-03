class Core2web{
	
	public static void main(String[] pratik){
		
		String s1 = new String("Core2web");
		String s2 = new String("Core2web");

		if(s1==s2)
			System.out.print("True 1 ");
		if(s1.equals(s2))
			System.out.print("True 2 ");
		if(s1.hashCode()==s2.hashCode())
			System.out.print("True 3 ");
		System.out.println(s1.hashCode()+" "+s2.hashCode());
	}

}
