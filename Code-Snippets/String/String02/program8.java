class Core2web{
	
	public static void main(String[] args){

		StringBuffer s1 = new StringBuffer("Core2web");
		StringBuffer s2 = new StringBuffer("Core2web");

		if(System.identityHashCode(s1).equals(System.identityHashCode(s2)))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
