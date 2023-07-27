class Demo{
	
	static int[][] createArray(int nums){
		
		int arr[][]=new int[nums][];

		for(int i=0 ; i<nums ; i++){
			
			arr[i]= new int[i+1];
			for(int j=0 ; j<=i ; j++){
				
				if(j==0 || j==i){
					arr[i][j]=1;
				}else{
					
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
		}

		return arr;
	}
	public static void main(String[] args){
		
		int arr[][] = createArray(5);

		for(int row[] : arr ){
			for(int element : row){
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
