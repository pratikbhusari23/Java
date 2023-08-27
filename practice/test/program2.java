class Main{
	
	public static void main(String[] args){
		
		int arr[] = {5,0,9,7,2,0};

		for(int i=0 ; i<arr.length-1 ; i++){	
			for(int j=i+1 ; j<arr.length ;j++){
				
				if(arr[i]*2==arr[j] && arr[i]!=0){
					System.out.println("Yes");
					return;
				}
			}
		}	
		System.out.println("No");
	}
}
