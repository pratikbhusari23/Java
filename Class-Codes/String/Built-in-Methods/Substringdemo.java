class SubstringDemo{
	
	public static void main(String[] args){
		
		String str = "Core2webTech";
		String str2 ="webTechnologies";
		System.out.println(str.substring(5));       //Webtech
		System.out.println(str.substring(0,3));

		if(str.substring(5).equals(str2.substring(0,7))){
			System.out.println("True");
		}
	}	
}
