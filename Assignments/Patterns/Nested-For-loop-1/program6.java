
class Pattern{
	public static void main(String[] pratik){
		
		int rows=3,cols=3;
		for(int i=1 , j=1; i<=rows && j<=cols ;){
			System.out.print(rows*cols+1-j+" ");
			j++; 
			if(j==cols+1){
				
				i++;
				j=1;
				System.out.print("\n");
			}
		}
	}
}
