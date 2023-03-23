/*
D D D D
D D D D
D D D D
D D D D
*/

class Pattern{
	public static void main(String[] pratik){
		char ch=68;
		int rows=4,cols=4;
		for(int i=1 , j=1 ; i<=rows && j<=cols ; ){
			System.out.print(ch+ " ");
			j++;
			if(j==cols+1){
				j=1;
				i++;
				System.out.print("\n");
			}
		}
	}
}
