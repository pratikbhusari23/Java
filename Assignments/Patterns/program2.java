class Patterns{

	public static void main(String [] pratik){
		
		int x=1 ;

		for(int i=1 , j=4; i<=4 && j>=1 ; ){

			if(i<j){
				System.out.print(" ");
			}
			else {	
				System.out.print(x);
				x++;
			}

			j--;
			if(j==0){
				j=4;
						
			System.out.println();
			i++;
			}

		}
	}
}

/*

   1
   23
   456
   78910

   */
