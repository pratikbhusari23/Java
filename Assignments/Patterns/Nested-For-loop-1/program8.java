/*
d d d d
c c c c
b b b b
a a a a
*/
class Pattern{
	public static void main(String[] pratik){
		char ch=100;
		int rows=4,cols=4;
		for(int i=1 , j=1 ; i<=rows && j<=cols ;){
			
			 System.out.print(ch+" ");
			 j++;
			 if(j==cols+1){
			 	
				 i++;
				 j=1;
				 ch--;
				 System.out.print("\n");
			 }
		}
	}
}
