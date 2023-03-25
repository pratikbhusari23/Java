class Pattern{
	public static void main(String[] pratik){

		int rows=4;	

		for(int i=1 ,j=1; i<=rows && j<=rows ; ){
			
			if(j==1 || j==rows || i==1 || i==rows){
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			j++;
			if(j==rows+1){
				i++;
				j=1;
				System.out.print("\n");
			}
			
		}

	}
	
}	

