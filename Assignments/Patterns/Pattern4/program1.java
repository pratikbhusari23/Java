      /*
   
       1
     1 2
   1 2 3
 1 2 3 4

 */
class Pattern{
	public static void main(String[] pratik){

		int rows=4,x=1;	

		for(int i=rows ,j=1; i>=1 && j<=rows ; ){
				
			if(j<i){
				System.out.print("  ");
			}
			else {
				System.out.print(x++ + " ");
			}
		
			j++;

			if(j==rows+1){
				System.out.println();
				i--;
				j=1;
				x=1;
			}
		}

	}
	
}	
