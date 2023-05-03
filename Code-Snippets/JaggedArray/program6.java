class JaggedArray{
	
	public static void main(String[] args){
		
		int[] arr[] = {1,2,3};

		for(int i=0 ; i<arr.length ; i++){
			
			System.out.print(arr[0] + " ");	
		}
	}
}
/*
program6.java:5: error: incompatible types: int cannot be converted to int[]
        int[] arr[] = {1,2,3};
                    ^
program6.java:5: error: incompatible types: int cannot be converted to int[]
			                       int[] arr[] = {1,2,3};
                                 ^
program6.java:5: error: incompatible types: int cannot be converted to int[]
         int[] arr[] = {1,2,3};
                                   ^
			   3 errors
			   
*/
