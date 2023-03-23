/*
12 12 12
11 11 11
10 10 10
*/
class Pattern{
	public static void main(String[] pratik){
		
		int rows=3,cols=3;
		for(int i=1 , j=1 ; i<=rows && j<=cols ;){
			
			System.out.print(rows*cols+rows+1-i + " ");
			j++;
			if(j==4){
				j=1;	
				System.out.print("\n");
				i++;
			}
		}

	}
}

