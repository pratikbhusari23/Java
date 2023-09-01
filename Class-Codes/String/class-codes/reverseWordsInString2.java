class Demo{
	
	public static void main(String[] args){
	
		String s[] = "i like Programming".split(" ");
		String ans="";
	
		for(int i=s.length-1 ; i>=0 ; i--){
			
			ans+=s[i]+" ";
		}

		System.out.println(ans.substring(0,ans.length()-1));

	}
}
