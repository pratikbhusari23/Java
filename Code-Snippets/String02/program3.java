class String02{
	
	public static void main(String[] args){
		
		String str1 = "Core2web";
		String str2 = " Technologies";

		if(str1 == str1.concat(str2)){
			
			System.out.println("Hey");
		}
		else if(str2==str1.concat(str2)){

			System.out.println("Hii");
		}
		else {
			System.out.println("Byee");
		}
	}
}
