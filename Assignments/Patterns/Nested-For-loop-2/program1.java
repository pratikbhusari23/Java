/*

C2W1 C2W2 C2W3 C2W4
C2W1 C2W2 C2W3 C2W4
C2W1 C2W2 C2W3 C2W4
C2W1 C2W2 C2W3 C2W4

*/

class Pattern{
	public static void main(String[] pratik){

		int rows=4,x=1,cols=4;	

		for(int i=1 ,j=1; i<=rows && j<=rows ; ){
			
			System.out.print("C2W"+j+" ");
			j++;
			if(j==cols+1){
				j=1;
				i++;
				System.out.println();
			}

		}
		

	}
	
}	
