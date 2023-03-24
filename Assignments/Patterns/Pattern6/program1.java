
class Pattern{
	public static void main(String[] pratik){

		int rows=4,x=1;	

		for(int i=rows ,j=1 , k=1; i>=1 && j<=rows && k<=2*i-1; ){
				
			if(j<i){
				System.out.print("  ");
				j++;
			}
			else {
				System.out.print("* ");
			}
		
			k++;

			if(j==rows+1){
				System.out.println();
				i--;
				j=1;
				x=1;
			}
		}

	}
	
}	
