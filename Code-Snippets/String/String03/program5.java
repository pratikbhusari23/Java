class Pratik{
	
	public static void main(String[] args){

		StringBuffer str = new StringBuffer("AndroidOne");

		str.delete(7,10);

		str.insert(str.length(),true);

		System.out.println(str);

	}
}
