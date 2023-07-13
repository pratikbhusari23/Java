class Demo{

	public static void main(String[] args){
		
		int[] arr ={1,2,3,4,5};

		String str3="";

		for(int i=0 ; i<arr.length ; i++){
			
			str3 += arr[i];
			if(i<arr.length-1){
				str3 += ", ";
			}
		}

		System.out.println(str3);

	}
}
