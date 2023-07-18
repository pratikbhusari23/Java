class Demo{
	
	public static void main(String[] args){
		
		int arr[] = {1,2,3,4};
		int max1 = Integer.MAX_VALUE;
		int max2 = Integer.MAX_VALUE;

		for(int i=0 ; i<arr.length ; i++){
			
			if(arr[i]<max1){
				
				max2=max1;
				max1=arr[i];
			}
			if(arr[i]<max2 && arr[i]>max1){
				
				max2 = arr[i];
			}
		}
		System.out.println(max2);
		
		int arr1[] = {1,2,3,4};
		int max11 = Integer.MIN_VALUE;
		int max22 = Integer.MIN_VALUE;

		for(int i=0 ; i<arr.length ; i++){
			
			if(arr[i]>max11){
				
				max22=max11;
				max11=arr[i];
			}
			if(arr[i]>max22 && arr[i]<max11){
				
				max22 = arr[i];
			}
		}
		System.out.println(max22);
	}
}
