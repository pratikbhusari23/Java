class Quiz{
		
	public static void main(String[] pratik){
		
		System.out.println("Before for loop");

		for(int i,j ; i<3 ;  i++ , j++){
			
			System.out.println("Inside for");
		
		}
		System.out.println("After forloop");
	}
}
/*
 
output :

	program4.java:7: error: variable i might not have been initialized
                for(int i,j ; i<3 ;  i++ , j++){
                              ^
	program4.java:7: error: variable j might not have been initialized
                for(int i,j ; i<3 ;  i++ , j++){
                                           ^
2 errors

 */