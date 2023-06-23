class Pratik{
	
	public static void main(String[] args){
		
		StringBuffer str1 = new StringBuffer("Demo");

		StringBuffer str2 = new StringBuffer();

		str2 = str2.append("Demo");

		System.out.println(str1.capacity()==str2.capacity());
	}
}
