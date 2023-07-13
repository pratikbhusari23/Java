class Demo{
	
	public static void main(String[] args){
	
		char ch[]={'j','a','v','a'};
		int arr[]= {97,98,99};

		String s = new String(ch);

		System.out.println(s);

		String y = new String(arr);  //error
		System.out.println(y);      // no suitable constructor found

	}
}
