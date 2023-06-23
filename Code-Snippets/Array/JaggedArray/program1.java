class JaggedArray{

	public static void main(String[] args){
		
		
		long arr1[]={1,2,3};	
		long arr2[]={4,5};

		long[][] arrlong = new long[2][];

		arrlong[0]=arr1;
		arrlong[1]=arr2;

		System.out.println(arrlong[0][1]);
	}

}
