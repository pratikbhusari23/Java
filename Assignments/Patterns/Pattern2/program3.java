/*

*
* *
* * *
* * * *
* * * * *

*/
class Pattern{
	public static void main(String[] pratik){
		
		int rows=4;

		for(int i=1 , j=1 ; i<=rows && j<=i ;){
			System.out.print("* ");	
			j++;
			if(j==i+1){
				i++;
				j=1;
				System.out.print("\n");
			}
		}
	}
}
