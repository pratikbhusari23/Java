class Demo{
	
	public static Boolean Sorted(int [] arr , int m){
		
		if(m==arr.length -1){
			return true;
		}
		Boolean b;

		if(arr[m]<=arr[m+1]){
			b=Sorted(arr,m+1);
		}
		else{
			b=false;
		}

		return b;

	}
	public static void main(String[] args){
		
		int arr[] = {1,2,3};
		System.out.println(Sorted(arr,0));
	}
}
