/*
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
*/

class Pattern{
	public static void main(String[] pratik){
		char ch=100;
		int rows=4,cols=4;
		for(int i=1 , j=1 ; i<=rows && j<=cols ;){
			System.out.print(i+j-1+ " ");
			j++;
			if(j==cols+1){
				
				j=1;
				i++;
				System.out.print("\n");
			}
		}
	}
}
