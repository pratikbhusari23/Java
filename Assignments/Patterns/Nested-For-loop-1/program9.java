/*

   C B A
   C B A
   C B A

*/
class Pattern{
	public static void main(String[] pratik){
		char ch=67;
		int rows=3,cols=3;
		for(int i=1 , j=1 ; i<=rows && j<=cols ;){
			System.out.print(ch+" ");
			ch--;
			j++;
			if(j==cols+1){
				j=1;
				ch=67;
				i++;
				System.out.print("\n");
			}
		}
	}
}
