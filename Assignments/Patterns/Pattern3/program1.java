class Pattern{
	public static void main(String[] pratik){
		
		int rows=4,cols=4;
		
		for(int i=rows , j=1 ; i>=1 && j<=i ;){
			System.out.print(j+" ");
			j++;
			if(j==i+1){
				j=1;
				i--;
				System.out.print("\n");
			}	
		}
	}
}
