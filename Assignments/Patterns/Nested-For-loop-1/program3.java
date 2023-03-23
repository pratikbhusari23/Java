/*
14 14 14 14
15 15 15 15
16 16 16 16
17 17 17 17
*/

class Pattern{
	public static void main(String[] pratik){

		int x=14;
		for(int i=1 , j=1 ; i<=4 && j<=4 ;){
			System.out.print(x+" ");
			j++;
			if(j==5){
				i++;
				j=1;
				x++;	
				System.out.print("\n");
			}
		}
	}
}
