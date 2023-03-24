/*

* * * *
  * * *
    * * 
      *

      */

class Pattern{
	public static void main(String[] pratik){

		int rows=4,x=1;	
		for(int i=1 ,j=1; i<=rows && j<=rows ; ){
				
			if(i<=j){
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		
			j++;

			if(j==rows+1){
				System.out.println();
				i++;
				j=1;
			}
		}

	}
	
}	
